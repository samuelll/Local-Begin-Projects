package com.olymp.Display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

import javax.swing.JFrame;

import com.olymp.IO.Input;

public abstract class Display {

	private static boolean created = false;
	private static JFrame window;
	private static Canvas content;
	private static BufferedImage buffer;
	private static int[] bufferData;
	private static Graphics bufferGraphics;
	private static int clearColor;	
	private static BufferStrategy multiBuffer;
	

	public static void create(int width, int height, String title, int clearColor, int numBuffers) {
		

		if (created)
			return;

		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content = new Canvas();
		Dimension size = new Dimension(width, height);
		content.setPreferredSize(size);
		window.setResizable(false);
		window.getContentPane().add(content);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		bufferData = ( (DataBufferInt) buffer.getRaster().getDataBuffer()).getData();
		bufferGraphics = buffer.getGraphics();
		((Graphics2D)bufferGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Display.clearColor = clearColor;
		content.createBufferStrategy(numBuffers);
		multiBuffer = content.getBufferStrategy();
		
		created = true;
	}
	
	public static void clear(){	
		Arrays.fill(bufferData, clearColor);
	}
	
	
	public static void swapBuffers(){
		Graphics g = multiBuffer.getDrawGraphics();
		g.drawImage(buffer, 0, 0, null);
		multiBuffer.show();
	}
	
	public static Graphics2D getGraphics(){
		return (Graphics2D)(bufferGraphics);
	}
	
	public static void destroy(){
		if(!created)
			return;
		window.dispose();
	}
	
	public static void setTitle(String titles){
		window.setTitle(titles);
	}
	
	public static void keyboard(Input keyListener){
		window.add(keyListener);
	}

}
