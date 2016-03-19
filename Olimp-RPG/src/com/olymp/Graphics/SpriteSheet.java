package com.olymp.Graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	private BufferedImage sheet;
	private int spriteCount;
	private int scale;
	private int sprites_in_Width;
	
	public SpriteSheet(BufferedImage sheet, int spriteCount, int scale){
		this.sheet = sheet;
		this.spriteCount = spriteCount;
		this.scale = scale;
		this.sprites_in_Width = sheet.getWidth() / scale;
	}
	
	public BufferedImage getSprite(int index){
		index = index % spriteCount;
		
		int x = index % sprites_in_Width * scale;
		int y = index / sprites_in_Width * scale;
		
		return sheet.getSubimage(x, y, scale, scale);
	}

}
