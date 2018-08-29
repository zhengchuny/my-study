package com.study.luxin.deginpattern.factory.simplefactory;

/**
 * Created by lx on 12/11/2017.
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza("AsPizza");
        pizza.bake();
        return pizza;
    }


}
