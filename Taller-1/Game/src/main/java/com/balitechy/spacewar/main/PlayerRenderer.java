/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface PlayerRenderer {
    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;
    void render(Graphics g);
    void tick();
    void setVelX(double velX);
    void setVelY(double velY);
    void shoot();
    double getX();
    double getY();
}
