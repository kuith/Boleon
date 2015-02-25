package com.digitalhollows.boleon.bgame;

import com.digitalhollows.boleon.framework.Game;
import com.digitalhollows.boleon.framework.Graphics;
import com.digitalhollows.boleon.framework.Screen;
import com.digitalhollows.boleon.framework.Input.TouchEvent;

import java.util.List;

/**
 * Created by Rafa on 25/02/2015.
 */
public class MainMenuScreen extends Screen {
    public MainMenuScreen(Game game){
        super(game);
    }

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List< TouchEvent > touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();



}
