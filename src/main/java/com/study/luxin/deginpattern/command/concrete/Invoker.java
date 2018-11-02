package com.study.luxin.deginpattern.command.concrete;

/**
 * Created by luxin on 2018/9/28.
 */
public class Invoker {
    private Command command;

    public void action(){
        command.execute();
    }


    public void setCommand(Command command) {
        this.command = command;
    }
}
