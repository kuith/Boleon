package com.digitalhollows.boleon.framework;

/**
 * Created by Rafa on 11/02/2015.
 */
public abstract class Screen {
    protected final Game game;

    public Screen (Game game){
        this.game = game;
    }

    public abstract void update (float deltaTime);

    public abstract void present ( float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

}
