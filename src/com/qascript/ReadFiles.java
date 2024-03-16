package com.qascript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/ddemo.txt");
            int c = fis.read();
            System.out.println((char) c);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
