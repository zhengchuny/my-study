package com.study.luxin.deginpattern.factory.simplefactory;

/**
 * Created by lx on 12/11/2017.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("AsPizza".equals(type)) {
            pizza = new AsPizza();
            return pizza;
        }
        return null;
    }

}
