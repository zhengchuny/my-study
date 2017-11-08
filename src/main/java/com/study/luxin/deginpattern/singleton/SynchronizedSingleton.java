package com.study.luxin.deginpattern.singleton;

/**
 * Created by luxin on 2017/11/4.
 * 这种能保证线程安全,但是 通过反射,还是能创建新的实例
 * 而且效率低,是对整个类的锁
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    public synchronized static SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
            return instance;

        } else {
            return instance;
        }
    }

}
