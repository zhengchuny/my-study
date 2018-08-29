package com.study.luxin.leetcode;

/**
 * Created by lx on 08/07/2018.
 * https://leetcode-cn.com/problems/jump-game/description/
 *
 * https://blog.csdn.net/lengxiaohe/article/details/80435788
 */
public class Jump {


    int[] nums1 = new int[]{2, 3, 1, 1, 4};

    public boolean canJump(int[] nums) {

        int maxReach=0;

        for (int i = 0; i < nums.length; i++) {
            // 其中的每个节点都是可以到达的,如果某个节点到达不了,那么也就到达不了最后一个节点.
            if(i>maxReach){
                return false;
            }

            maxReach = Math.max(maxReach,i+nums[i]);
            if(maxReach>=nums.length-1){
                return true;
            }
        }

        return false;
    }




}
