package com.digitalhollows.boleon.framework.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Environment;
import android.preference.PreferenceManager;

import com.digitalhollows.boleon.framework.FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Rafa on 12/02/2015.
 */
public class AndroidFileIO implements FileIo {
    Context context;
    AssetManager assets;
    String externalStoragePath;
    public AndroidFileIO(Context context){
        this.context = context;
        this.assets = context.getAssets();
        this.externalStoragePath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    }

    @Override
    public InputStream readAsset (String fileName) throws IOException{
        return assets.open(fileName);
    }

    @Override
    public InputStream readFile(String fileName) throws IOException{
        return new FileInputStream(externalStoragePath + fileName);
    }

    @Override
    public OutputStream writeFile(String fileName) throws IOException{
        return new FileOutputStream(externalStoragePath + fileName);
    }

    public SharedPreferences getPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
