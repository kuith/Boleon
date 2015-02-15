package com.digitalhollows.boleon.framework.impl;

import android.graphics.Bitmap;

import com.digitalhollows.boleon.framework.Pixmap;
import com.digitalhollows.boleon.framework.Graphics.PixmapFormat;


/**
 * Created by Rafa on 15/02/2015.
 */
public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }
    public int getWidth() {
        return bitmap.getWidth();
    }
    public int getHeight() {
        return bitmap.getHeight();
    }

    public PixmapFormat getFormat() {
        return format;
    }
    public void dispose() {
        bitmap.recycle();
    }
}
