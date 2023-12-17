package com.marine.hot100.putongshuzu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 缺失的第一个正数
 */
public class p5 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int res = method2(nums);
        System.out.println(res);
    }

    /**
     * 使用了额外的空间
     * @param nums
     * @return
     */
    public static int method1(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return nums.length + 1;
    }

    /**
     * 不使用额外的空间
     */
    public static int method2(int[] nums){
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] <= 0){
                nums[i] = len + 1;
            }
        }

        for(int i = 0; i < len; i++){
            int num = Math.abs(nums[i]);
            if(num <= len){
                nums[num - 1] = -Math.abs(nums[num -1]);
            }
        }

        for(int i = 0; i < len; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }

        return len + 1;
    }
}
