package com.study.luxin;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            val = val;
        }
    }

    @Test
    public void test() {
        System.out.println("sdfsdf");
    }


    @Test
    public void test1() {
        int[] a = new int[]{1, 3, 4, 10, 9, 8, 1};


        int min = a[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] - min > max) {
                max = a[i] - min;
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
    }

}
