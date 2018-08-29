package com.study.luxin.deginpattern.proxy;

/**
 * Created by lx on 09/04/2018.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("realSubject done!");
    }
}
