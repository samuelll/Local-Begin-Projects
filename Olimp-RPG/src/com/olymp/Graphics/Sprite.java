package com.olymp.Graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Sprite {
	
	private SpriteSheet sheet;
	private double scale;
	
	public Sprite(SpriteSheet sheet, double scale){
		this.sheet = sheet;
		this.scale = scale;
		
	}
	
	public void render(Graphics2D g, double x, double y){
		BufferedImage img = sheet.getSprite(0);
		g.drawImage(img, (int)(x), (int)(y), (int) (img.getWidth() * scale), (int) (img.getHeight() * scale), null);
	}
}
