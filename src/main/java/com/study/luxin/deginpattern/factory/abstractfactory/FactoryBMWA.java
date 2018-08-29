package com.study.luxin.deginpattern.factory.abstractfactory;

/**
 * Created by lx on 19/11/2017.
 */
public class FactoryBMWA implements AbstractFactory{


    public Engine createEngine() {
        return new EngineA();
    }

    public AirCondition createAirCondition() {
        return new AirConditionA();
    }
}
