package com.study.luxin.deginpattern.observer;

import lombok.Data;

import java.util.Observable;

@Data
public class WeatherData extends Observable {

    private Integer temperature;
    private Integer humidity;
    private Integer pressure;


    public void measurementChanged() {
        setChanged();
        notifyObservers(this);
    }

}
