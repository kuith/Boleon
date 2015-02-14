package com.digitalhollows.boleon.framework.impl;

import java.util.List;
import android.view.View.OnTouchListener;
import com.digitalhollows.boleon.framework.Input.TouchEvent;

/**
 * Created by Rafa on 14/02/2015.
 */
public interface TouchHandler extends OnTouchListener{
    public boolean isTouchDown(int pointer);
    public int getTouchX(int pointer);
    public int getTouchY(int pointer);
    public List <TouchEvent> getTouchEvents();
}
