package com.study.luxin;

import org.junit.Test;

/**
 * Created by luxin on 2018/10/25.
 */
public class FinalParamTest {

    public static int a = 10;

    @Test
    public void test() {

        add(a);
        System.out.println(a);

    }


    private void add(int a) {
        a = a + 3;
    }


}
