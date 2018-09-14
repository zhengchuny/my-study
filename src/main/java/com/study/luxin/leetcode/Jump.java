package com.study.luxin.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by lx on 08/07/2018.
 * https://leetcode-cn.com/problems/jump-game/description/
 * <p>
 * https://blog.csdn.net/lengxiaohe/article/details/80435788
 */
public class Jump {


    int[] nums1 = new int[]{2, 3, 1, 1, 4};

    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // 其中的每个节点都是可以到达的,如果某个节点到达不了,那么也就到达不了最后一个节点.
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }


    public List<Integer> minJump(int[] nums) {
        List<Integer> list = Lists.newArrayList();
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            p = findRangeMaxPosition(nums, i);
            if (p + nums[p] <= i) {
                return null;
            }
            list.add(nums[p]);
            if (p + nums[p] > nums.length - 1) {
                return list;
            }
        }
        return null;
    }

    private int findRangeMaxPosition(int[] nums, int position) {
        int max = 0;
        int j = position;
        for (int i = position; i < nums.length && i < position + nums[position]; i++) {

            if (nums[i] + i > max) {
                max = nums[i] + i;
                j = i;
            }
        }
        return j;
    }

    @Test
    public void test(){
        System.out.println(minJump(nums1));
    }

}
