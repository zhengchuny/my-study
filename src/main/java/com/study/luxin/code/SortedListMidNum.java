package com.study.luxin.code;

import org.junit.Test;

/**
 * Created by lx on 13/05/2018.
 *
 本题若没有限制时间复杂度为O(log(m+n))的话，对两个数组使用归并排序，很容易可以找到他们的中位数，所用时间复杂度为O(m*n)。但是要将时间复杂度降为O(log(m+n))，就需要尝试对两个数组同时进行二分查找，逐步排除掉不可能出现中位数的区间，最后找到所求的中位数。这种解法的主要思想就是：
 如果数组a的中位数小于数组b的中位数，那么整体的中位数只可能出现在a的右区间加上b的左区间之中；
 如果数组a的中位数大于等于数组b的中位数，那么整体的中位数只可能出现在a的左区间加上b的右区间之中。
 关键就是利用分治的思想逐渐缩小a的区间和b的区间来找到中位数。
 */
public class SortedListMidNum {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;









        return 0D;
    }

    public double mid(int[] num1, int a1,int a2,int[] num2,int b1,int b2){









        return 0D;
    }






    @Test
    public void test(){
        int[] nums1={1,2,3}; int[] nums2={4,5};

        System.out.println(findMedianSortedArrays(nums1,nums2));

    }


}
