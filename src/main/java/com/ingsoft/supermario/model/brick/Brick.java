package com.ingsoft.supermario.model.brick;

import com.ingsoft.supermario.manager.GameEngine;
import com.ingsoft.supermario.model.GameObject;
import com.ingsoft.supermario.model.Map;
import com.ingsoft.supermario.model.prize.Prize;

import java.awt.image.BufferedImage;

public abstract class Brick extends GameObject{

    private boolean breakable;

    private boolean empty;

    public Brick(double x, double y, BufferedImage style){
        super(x, y, style);
        setDimension(48, 48);
    }

    public boolean isBreakable() {
        return breakable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Prize reveal(GameEngine engine){ return null;}

    public Prize getPrize() {
        return null;
    }
}
