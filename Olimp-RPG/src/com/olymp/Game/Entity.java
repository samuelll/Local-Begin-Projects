package com.olymp.Game;


import java.awt.Graphics2D;

import com.olymp.Entity.EntityType;
import com.olymp.IO.Input;

public abstract class Entity {
	
		public final EntityType type;
		
		protected double 		x;
		protected double		y;
		
	protected Entity(EntityType type, double x, double y){
		this.type = type;
		this.x = x;
		this.y = y;
		
		
	}
	
	public abstract void update(Input input);
	public abstract void render(Graphics2D g);
	
	public void player(){
		
		
	}
	

}
