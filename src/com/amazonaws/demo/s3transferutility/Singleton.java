package com.amazonaws.demo.s3transferutility;

/**
 * Created by Seng Guan on 2018/1/1.
 */

public class Singleton {
    private static Singleton instance = new Singleton();
    private static String Path;

    private Singleton()
    {
        System.out.println("Singleton(): Initializing Instance");
    }

    public static Singleton getInstance()
    {
        return instance;
    }

    public void setAppDirectory(String Path) {
        this.Path = Path;
    }

    public String getAppDirectory() {
        return Path;
    }
}
