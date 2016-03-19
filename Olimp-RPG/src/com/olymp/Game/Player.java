package com.olymp.Game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import com.olymp.Entity.EntityType;
import com.olymp.Graphics.Sprite;
import com.olymp.Graphics.SpriteSheet;
import com.olymp.Graphics.TextureAtlas;
import com.olymp.IO.Input;

public class Player extends Entity {
	
	public static final int spriteScale = 31;
	
	private enum Moving{
		up(6 * spriteScale, 6 * spriteScale, spriteScale, spriteScale),
		down(6 * spriteScale, 6 * spriteScale, spriteScale, spriteScale),
		right(6 * spriteScale, 6 * spriteScale, spriteScale, spriteScale),
		left(6 * spriteScale, 6 * spriteScale, spriteScale, spriteScale);
		
		private int x, y, w, h;
		
		Moving(int x, int y, int w, int h){
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
		
		protected BufferedImage texture(TextureAtlas atlas){
			return atlas.cut(x, y, w, h);
		}
	}
	
	private Moving moving;
	private Map<Moving, Sprite> renderMap;
	private double scale;
	private double speed;

	public Player(double x, double y, double diameter, TextureAtlas atlas, double scale, double speed) {
		super(EntityType.Player, x, y);
		
		moving = Moving.up;
		renderMap = new HashMap<Moving, Sprite>();
		this.scale = scale;
		this.speed = speed;
		
		
		for(Moving m: Moving.values()){
			SpriteSheet sheet = new SpriteSheet(m.texture(atlas), 1, spriteScale);
			Sprite sprite = new Sprite(sheet, scale);
			renderMap.put(m, sprite);
		}
	}

	@Override
	public void update(Input input) {
		double newX = x;
		double newY = y;
		
		if(input.getKey(KeyEvent.VK_UP)){
			newY -= speed;
			moving = Moving.up;
		}
		else if(input.getKey(KeyEvent.VK_DOWN)){
			newY += speed;
			moving = Moving.down;
		}
		else if(input.getKey(KeyEvent.VK_RIGHT)){
			newX += speed;
			moving = Moving.right;
		}
		else if(input.getKey(KeyEvent.VK_LEFT)){
			newX -= speed;
			moving = Moving.left;
		}
		
		if(newX < 0){
			newX = 0;
		}
		else if(newX >= Game.WIDTH - spriteScale * scale - 1){
			newX = Game.WIDTH - spriteScale * scale - 1;
		}
		
		if(newY < 0){
			newY = 0;
		}
		else if(newY >= Game.HEIGHT - spriteScale * scale -1){
			newY = Game.HEIGHT - spriteScale * scale -1;
		}
		
		x = newX;
		y = newY;
	}

	public void render(Graphics2D g) {
		renderMap.get(moving).render(g, x, y);
	} 
}
