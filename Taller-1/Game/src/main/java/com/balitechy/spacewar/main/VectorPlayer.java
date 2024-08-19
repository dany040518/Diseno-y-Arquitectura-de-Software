/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Home
 */
public class VectorPlayer implements PlayerRenderer {
    private double x, y;
    private double velX, velY;
    private Game game;

    public VectorPlayer(double x, double y, Game game) {
        this.x = x;
        this.y = y;
        this.game=game;
    }
    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        int[] xPoints = {(int)x, (int)x + WIDTH / 2, (int)x - WIDTH / 2};
        int[] yPoints = {(int)y, (int)y + HEIGHT, (int)y + HEIGHT};
        g.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void setVelX(double velX) {
        this.velX=velX;
    }

    @Override
    public void setVelY(double velY) {
        this.velY=velY;
    }

    @Override
    public void shoot() {
        BulletRenderer bullet = new VectorBullet(x, y);
        game.getBullets().addBullet(bullet);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
    
}
