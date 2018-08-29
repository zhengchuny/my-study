package com.study.luxin.classload;

import org.junit.Test;

/**
 * Created by lx on 27/05/2018.
 */
public class MyClassLoadTest {



    @Test
    public void classLoadTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Father father = new Father();

        Son son = (Son)this.getClass().getClassLoader().loadClass("com.study.luxin.classload.Son").newInstance();

        System.out.println(son);

    }








}
