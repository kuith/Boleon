package com.digitalhollows.boleon.bgame;

import com.digitalhollows.boleon.framework.Screen;
import com.digitalhollows.boleon.framework.impl.AndroidGame;

/**
 * Created by Rafa on 23/02/2015.
 */
public class boleonGame extends AndroidGame {
    public Screen getStartScreen(){
        return new LoadingScreen(this);
    }
}
