package com.study.luxin.deginpattern.singleton;

/**
 * Created by luxin on 2017/11/4.
 * classLoader保证线程安全,且做到lazy loading
 */
public class InnerSingleton {

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
