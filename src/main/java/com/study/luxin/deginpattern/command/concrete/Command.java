package com.study.luxin.deginpattern.command.concrete;

/**
 * Created by luxin on 2018/9/28.
 */
public interface Command {
    void execute();
    void undo();
}
