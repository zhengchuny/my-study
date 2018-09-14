package com.study.luxin.deginpattern.decorator;

/**
 * Created by luxin on 2018/9/3.
 */
public class BlackCoffee implements Beverage {

    private int size;


    @Override
    public double cost() {
        return 20;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
}
