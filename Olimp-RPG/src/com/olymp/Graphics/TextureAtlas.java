package com.olymp.Graphics;

import java.awt.image.BufferedImage;

import com.olymp.Utils.ResourceLoader;

public class TextureAtlas {
	BufferedImage imageBall;
	BufferedImage imageOne;
	BufferedImage imageTwo;
	
	public TextureAtlas(String imageName, String imageNameTwo, String imageBallName){
		imageBall = ResourceLoader.loadImage(imageBallName);
		imageOne = ResourceLoader.loadImage(imageName);
		imageTwo = ResourceLoader.loadImage(imageNameTwo);
		
	}
	
	public BufferedImage cut(int x, int y, int w, int h){
		return imageBall.getSubimage(x, y, w, h);
	}
	
	public BufferedImage imgOne(int x, int y, int w, int h){
		return imageOne.getSubimage(x, y, w, h);
		
	}
	
	public BufferedImage imgTwo(int x, int y, int w, int h){		
		return imageTwo.getSubimage(x, y, w, h);
	}
	
	

}
