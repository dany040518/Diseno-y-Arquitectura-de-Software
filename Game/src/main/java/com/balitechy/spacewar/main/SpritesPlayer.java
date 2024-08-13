package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritesPlayer implements PlayerRenderer {
	
	private double x;
	private double y;
	
	private double velX;
	private double velY;
	
	
	
	private BufferedImage image;
	private Game game;
	
	public SpritesPlayer(double x, double y, Game game){
		this.x = x;
		this.y = y;
		this.game = game;
		
		// Get image for Player		
		image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	public void shoot(){
		SpritesBullet b = new SpritesBullet(x+(WIDTH/2)-5, y-18, game);
		game.getBullets().addBullet(b);
	}

	public void tick(){
		x += velX;
		y += velY;
		
		// To avoid player go outside the arena.		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}
}
