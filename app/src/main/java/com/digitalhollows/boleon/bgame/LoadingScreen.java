package com.digitalhollows.boleon.bgame;

import com.digitalhollows.boleon.framework.Game;
import com.digitalhollows.boleon.framework.Graphics;
import com.digitalhollows.boleon.framework.Screen;
import com.digitalhollows.boleon.framework.Graphics.PixmapFormat;

/**
 * Created by Rafa on 24/02/2015.
 */
public class LoadingScreen  extends Screen{
    public LoadingScreen(Game game){
        super(game);
    }

    public void update(float deltaTime){
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
        Assets.ball = g.newPixmap("ball.png", PixmapFormat.ARGB4444);
        Assets.boleon = g.newPixmap("boleon.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("gameOver.png", PixmapFormat.ARGB4444);
        Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
        Assets.help4 = g.newPixmap("help4.png", PixmapFormat.ARGB4444);
        Assets.help5 = g.newPixmap("help5.png", PixmapFormat.ARGB4444);
        Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("mainMenu.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("pause.png", PixmapFormat.ARGB4444);
        Assets.pentagon = g.newPixmap("pentagon.png", PixmapFormat.ARGB4444);
        Assets.square = g.newPixmap("square.png", PixmapFormat.ARGB4444);
        Assets.triangle = g.newPixmap("triangle.png", PixmapFormat.ARGB4444);
        Assets.versus_triangle = g.newPixmap("versus_triangle.png", PixmapFormat.ARGB4444);
        Assets.versusPentagon = g.newPixmap("versusPentagon.png", PixmapFormat.ARGB4444);
        Assets.versusSquare = g.newPixmap("versusSquare.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Settings.load(game.getFileIo());
        game.setScreen(new MainMenuScreen(game));
     }

    public void present(float deltaTime) {
    }
    public void pause() {
    }
    public void resume() {
    }
    public void dispose() {
    }
}
