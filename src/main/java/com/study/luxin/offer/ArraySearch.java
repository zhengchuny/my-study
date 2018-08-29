package com.study.luxin.offer;

import org.junit.Test;

/**
 * Created by lx on 06/04/2018.
 */
//在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class ArraySearch {

    int[][] array = {{1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {61, 71, 81, 91, 104},
            {106, 107, 108, 109, 1010},
            {2006, 2007, 2008, 2009, 20010}};


    public boolean find(int target, int[][] array) {
        int rowSize = array.length;
        int columnSize = array[0].length;

        if ((array.length == 0 && array[0].length == 0) || array == null) {
            return false;
        } else {

            int r = 0;
            int c = columnSize - 1;
            while (c >= 0 && r < rowSize) {
                if (array[r][c] < target) {
                    r++;
                } else if (array[r][c] > target) {
                    c--;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    @Test
    public void test() {

        System.out.println(find(107, array));


    }


}
