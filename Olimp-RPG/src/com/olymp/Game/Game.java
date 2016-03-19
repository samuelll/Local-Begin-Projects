package com.olymp.Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import com.olymp.Display.Display;
import com.olymp.Graphics.TextureAtlas;
import com.olymp.IO.Input;
import com.olymp.Utils.Time;

public class Game implements Runnable {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Olymp";
	public static final int clearColor = 0xff000000;
	public static final int numBuffers = 3;

	public static final float updt_rate = 25.0f;
	public static final float updt_interval = Time.SECOND / updt_rate;
	public static final long idle = 1;
	
	public static final String IMG_LOCAL = "lab_one.jpg";
	public static final String IMG_LOCAL_TWO = "lab_two.jpg";
	public static final String IMG_LOCAL_BALL = "ball-texture.png";
	

	private boolean running;
	private Thread gameThread;
	private Input input;	
	private Graphics2D map_one;
	private Graphics2D graphicsBall;
	private static Graphics2D graphicstwo;
	private TextureAtlas atlas;
	private Player player;
	

	public Game() {
		running = false;
		Display.create(WIDTH, HEIGHT, TITLE, clearColor, numBuffers);
		map_one = Display.getGraphics();
		graphicsBall = Display.getGraphics();
		graphicstwo = Display.getGraphics();
		input = new Input();
		Display.keyboard(input);
		atlas = new TextureAtlas(IMG_LOCAL, IMG_LOCAL_TWO, IMG_LOCAL_BALL);
		player = new Player(30, 30, 31, atlas, 1, 18);
	}

	public synchronized void start() {
		if(running)
			return;
		
		running = true;
		gameThread = new Thread(this);
		gameThread.start();

	}

	public synchronized void stop() {
		
		if(!running)
			return;
		
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cleanUp();
		
	}

	private void update() {
		player.update(input);
	}

	private void render() {
		//BufferedImage a = atlas.imgOne(0, 0, 310, 310);
		BufferedImage b = atlas.imgTwo(0, 0, 512, 512);
	
		Display.clear();
		map_one.drawImage(b, 0, 0, WIDTH, HEIGHT, null);
		
		
		player.render(graphicsBall);
		//sprite.render(graphicsBall, x, y);
		
		graphicstwo.setColor(Color.red);
		graphicstwo.fillOval(800 - 40 - 10, 600 - 40 - 10, 40, 40);				
		Display.swapBuffers();
		

	}
	
	

	public void run() {

		int fps = 0;
		int upd = 0;
		int updl = 0;

		long count = 0;

		float delta = 0;

		long lastTime = Time.get();
		while (running) {
			long now = Time.get();
			long elapsedTime = now - lastTime;
			lastTime = now;

			count += elapsedTime;

			boolean render = false;
			delta += (elapsedTime / updt_interval);
			while (delta > 1) {
				update();
				upd++;
				delta--;
				if (render) {
					updl++;
				} else {
					render = true;
				}
			}

			if (render) {
				render();
				fps++;
			} else {
				try {
					Thread.sleep(idle);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (count >= Time.SECOND) {
				Display.setTitle(TITLE + " || Fps: " + fps + " | Upd: " + upd + " | Updl: " + updl);
				upd = 0;
				fps = 0;
				updl = 0;
				count = 0;
			}

		}

	}
	private void cleanUp() {
		Display.destroy();

	}
}
