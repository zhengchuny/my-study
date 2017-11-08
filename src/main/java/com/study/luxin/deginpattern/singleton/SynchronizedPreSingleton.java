package com.study.luxin.deginpattern.singleton;

/**
 * Created by luxin on 2017/11/4. 这种通过类的加载的机制,保证了不会有多线程的问题,同时通过反射能创建新的
 * 这种方式不是lazy loading
 */
public class SynchronizedPreSingleton {
    private static SynchronizedPreSingleton instance = new SynchronizedPreSingleton();

    private SynchronizedPreSingleton() {
    }

    public static SynchronizedPreSingleton getInstance() {
        return instance;
    }

}
