package com.study.luxin.deginpattern.factory.abstractfactory;

/**
 * Created by lx on 19/11/2017.
 */
public class FactoryBMMB implements AbstractFactory {
    public Engine createEngine() {
        return new EngineB();
    }

    public AirCondition createAirCondition() {
        return new AirConditionB();
    }
}
