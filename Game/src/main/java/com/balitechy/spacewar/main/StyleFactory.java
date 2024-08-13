/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balitechy.spacewar.main;

/**
 *
 * @author Home
 */
public interface StyleFactory {
    PlayerRenderer createPlayerRenderer(double x, double y, Game game);
    BulletRenderer createBulletRenderer(double x, double y, Game game);
    BackgroundRenderer createBackgroundRenderer(Game game);
}
