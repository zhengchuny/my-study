package com.study.luxin.deginpattern.factory.abstractfactory;

/**
 * Created by lx on 19/11/2017.
 */
public class Client {


    public static void main(String[] args) {
        FactoryBMMB factoryBMEB = new FactoryBMMB();
        factoryBMEB.createAirCondition();
        factoryBMEB.createEngine();

        FactoryBMWA factoryBMWA = new FactoryBMWA();
        factoryBMWA.createAirCondition();
        factoryBMWA.createEngine();



    }










}
