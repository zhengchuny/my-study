package com.study.luxin.deginpattern.command;

/**
 * Created by luxin on 2018/9/28.
 */
public class DoorOpenCommand implements Command {
    Door door;


    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }
}
