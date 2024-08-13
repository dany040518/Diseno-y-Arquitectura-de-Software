/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

/**
 *
 * @author Home
 */
public class VectorStyleFactory implements StyleFactory{

    @Override
    public PlayerRenderer createPlayerRenderer(double x, double y, Game game) {
        return new VectorPlayer(x, y, game);
    }

    @Override
    public BulletRenderer createBulletRenderer(double x, double y, Game game) {
        return new VectorBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer(Game game) {
        return new VectorBackground();
    }
    
}
