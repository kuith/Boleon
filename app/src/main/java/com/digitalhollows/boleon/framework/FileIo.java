package com.digitalhollows.boleon.framework;

/**
 * Created by Rafa on 10/02/2015.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface FileIo {
    public InputStream readAsset(String fileName) throws IOException;
    public InputStream readFile(String fileName) throws IOException;
    public OutputStream writeFile(String fileName) throws IOException;
}
