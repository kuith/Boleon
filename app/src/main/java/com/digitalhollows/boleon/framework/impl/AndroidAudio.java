package com.digitalhollows.boleon.framework.impl;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;

import com.digitalhollows.boleon.framework.Audio;
import com.digitalhollows.boleon.framework.Music;
import com.digitalhollows.boleon.framework.Sound;

import java.io.IOException;

/**
 * Created by Rafa on 13/02/2015.
 */
public class AndroidAudio implements Audio {
    AssetManager assets;
    SoundPool soundPool;

    public AndroidAudio(Activity activity){
        activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        this.assets=activity.getAssets();
        this.soundPool=new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
    }

    public Music newMusic(String filename){
        try {
            AssetFileDescriptor assetDescriptor=assets.openFd(filename);
            return new AndroidMusic(assetDescriptor);
        } catch (IOException e){
            throw new RuntimeException("Could not load music '" +filename+"'");
        }
    }

    public Sound newSound(String filename){
        try {
            AssetFileDescriptor assetDescriptor=assets.openFd(filename);
            int soundId = soundPool.load(assetDescriptor, 0);
            return new AndroidSound(soundPool, soundId);
        } catch (IOException e) {
            throw new RuntimeException("Could not load music '" +filename+"'");
        }
    }


}
