package com.digitalhollows.boleon.bgame;

import com.digitalhollows.boleon.framework.Game;
import com.digitalhollows.boleon.framework.Graphics;
import com.digitalhollows.boleon.framework.Input.TouchEvent;
import com.digitalhollows.boleon.framework.Screen;

import java.util.List;

/**
 * Created by Rafa on 03/03/2015.
 */
public class HelpScreen5 extends Screen {
    public HelpScreen5(Game game){
        super(game);
    }

    @Override
    public void update(float deltaTime){
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();

        int len = touchEvents.size();
        for(int i = 0; i < len; i++){
            TouchEvent event = touchEvents.get(i);
            if(event.type == TouchEvent.TOUCH_UP){
                if(event.x > 256 && event.y > 416){
                    game.setScreen(new HelpScreen5(game));
                    if(Settings.soundEnabled)
                        Assets.click.play(1);
                    return;
                }
            }
        }
    }

    @Override
    public void present(float deltaTime){
        Graphics g = game.getGraphics();
        g.drawPixmap(Assets.background, 0, 0);
        g.drawPixmap(Assets.help1, 64, 100);
        g.drawPixmap(Assets.buttons, 256, 416, 0, 64, 64, 64);
    }

    @Override
    public void pause() {
    }
    @Override
    public void resume() {
    }
    @Override
    public void dispose() {
    }

}
