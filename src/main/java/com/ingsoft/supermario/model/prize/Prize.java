package com.ingsoft.supermario.model.prize;

import com.ingsoft.supermario.manager.GameEngine;
import com.ingsoft.supermario.manager.MapManager;
import com.ingsoft.supermario.model.hero.Mario;

import java.awt.*;

public interface Prize {

    int getPoint();

    void reveal();

    Rectangle getBounds();

    void onTouch(Mario mario, GameEngine engine);

}
