package com.digitalhollows.boleon.framework;

/**
 * Created by Rafa on 11/02/2015.
 */
public interface Game {
    public Input getInput();

    public FileIo getFileIO();

    public Graphics getGraphics();

    public Audio getAudio();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getStartScreen();
}
