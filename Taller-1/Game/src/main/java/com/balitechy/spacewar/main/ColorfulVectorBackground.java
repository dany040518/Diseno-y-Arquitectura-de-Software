/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

/**
 *
 * @author Home
 */
public class ColorfulVectorBackground implements BackgroundRenderer {

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.LIGHT_GRAY);
        
        // Dibujar las líneas del óvalo sin relleno
        g.fillOval(2, 5, 200, 200);
    }
}
