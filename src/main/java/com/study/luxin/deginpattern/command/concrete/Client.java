package com.study.luxin.deginpattern.command.concrete;

/**
 * Created by luxin on 2018/9/28.
 */
public class Client {


    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }


}
