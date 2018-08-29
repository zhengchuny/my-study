package com.study.luxin.syn;

/**
 * Created by lx on 02/08/2018.
 */
public class Father {

    public synchronized void doSomething() throws InterruptedException {
        System.out.println("father do.");
    }


}
