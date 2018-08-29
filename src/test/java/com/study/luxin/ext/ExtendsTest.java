package com.study.luxin.ext;

import org.junit.Test;

/**
 * Created by lx on 06/04/2018.
 */
public class ExtendsTest {

    @Test
    public void extendsTest() {
        Father child = new Child();
        System.out.println(child.getName());
    }


}
