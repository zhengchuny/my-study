package com.study.luxin.deginpattern.command.concrete;

/**
 * Created by luxin on 2018/9/28.
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;

    public void execute() {
        receiver.doSomething();
    }

    public void undo() {

    }

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
