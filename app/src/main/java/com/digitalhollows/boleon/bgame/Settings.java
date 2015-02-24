package com.digitalhollows.boleon.bgame;

import  com.digitalhollows.boleon.framework.FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * Created by Rafa on 24/02/2015.
 */
public class Settings {
    public static boolean soundEnabled = true;
    public static int[] highscores = new int[]{ 100, 80, 50, 30, 10};

    public static void load(FileIo files){
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(files.readFile(".bgame")));
            soundEnabled = Boolean.parseBoolean(in.readLine());
            for (int i = 0; i < 5; i++){
                highscores[i] = Integer.parseInt(in.readLine());
            }
        } catch (IOException e){
            // : (It is ok we have defaults
        } catch (NumberFormatException e){
            // : /It is ok, defaults save our day
        } finally {
            try{
                if (in != null)
                        in.close();
            } catch (IOException e){
            }
        }
    }

    public static void save(FileIo files) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    files.writeFile(".bgame")));
            out.write(Boolean.toString(soundEnabled));
            for (int i = 0; i < 5; i++) {
                out.write(Integer.toString(highscores[i]));
            }
        } catch (IOException e) {
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
            }
        }
    }

    public static void addScore(int score) {
        for (int i = 0; i < 5; i++) {
            if (highscores[i] < score) {
                for (int j = 4; j > i; j--)
                    highscores[j] = highscores[j - 1];
                highscores[i] = score;
                break;
            }
        }
    }
}

