package com.study.luxin.deginpattern.decorator;

/**
 * Created by luxin on 2018/9/3.
 */
public class CoffeeTest {

    public void test() {

        Beverage blackCoffee = new BlackCoffee();
        blackCoffee = new Mocha(blackCoffee);
        blackCoffee = new Mocha(blackCoffee);
        blackCoffee = new Whip(blackCoffee);

        double cost = blackCoffee.cost();
        System.out.println(cost);
    }


}
