/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import static com.balitechy.spacewar.main.BulletRenderer.HEIGHT;
import static com.balitechy.spacewar.main.BulletRenderer.WIDTH;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Home
 */
public class ColorfulVectorBullet implements BulletRenderer {

    private double x, y;
    
    public ColorfulVectorBullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect((int)x, (int)y, WIDTH, HEIGHT);
    }

    @Override
    public void tick() {
        y -= 5;
    }

    @Override
    public double getY() {
        return y;
    }
    
}
