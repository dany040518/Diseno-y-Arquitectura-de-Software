/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;

/**
 *
 * @author Home
 */
public interface BackgroundRenderer {
    void render(Graphics g, Canvas c) throws IOException;
}
