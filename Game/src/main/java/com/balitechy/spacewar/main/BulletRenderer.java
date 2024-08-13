/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Graphics;

/**
 *
 * @author Home
 */
public interface BulletRenderer {
    public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
    void render(Graphics g);
    void tick();
    double getY();
}
