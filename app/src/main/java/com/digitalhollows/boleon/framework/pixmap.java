package com.digitalhollows.boleon.framework;
import com.digitalhollows.boleon.framework.Graphics.PixmapFormat;

/**
 * Created by Rafa on 11/02/2015.
 */
public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
