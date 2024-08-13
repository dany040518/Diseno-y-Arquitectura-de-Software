package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritesBackground implements BackgroundRenderer {
        
    private SpritesImageLoader bg;
    
    public SpritesBackground(Game game) {
        bg = new SpritesImageLoader("/bg.png");
        try {
            bg.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void render(Graphics g, Canvas c) throws IOException{
		BufferedImage background = null;
		SpritesImageLoader bg;
		bg = new SpritesImageLoader("/bg.png");
		bg.loadImage();
		background = bg.getImage(0, 0, 640, 480);
		g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
		
	}
	
}
