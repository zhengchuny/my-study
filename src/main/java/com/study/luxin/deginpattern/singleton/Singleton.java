package com.study.luxin.deginpattern.singleton;

/**
 * Created by luxin on 2017/11/4.
 * 这种 多线程下不安全
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {

            instance = new Singleton();
            return instance;
        } else {
            return instance;
        }
    }

}
