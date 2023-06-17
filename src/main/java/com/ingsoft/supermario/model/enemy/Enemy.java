package com.ingsoft.supermario.model.enemy;

import com.ingsoft.supermario.model.GameObject;

import java.awt.image.BufferedImage;


public abstract class Enemy extends GameObject{

    public Enemy(double x, double y, BufferedImage style) {
        super(x, y, style);
        setFalling(false);
        setJumping(false);
    }
}
