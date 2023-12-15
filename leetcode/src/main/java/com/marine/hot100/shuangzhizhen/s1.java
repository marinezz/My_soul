package com.marine.hot100.shuangzhizhen;

import java.util.Arrays;

/**
 * 移动0
 */
public class s1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        method1(nums);;
        int[] nums2 = {0,1,0,3,12};
        method2(nums2);
    }

    /**
     * 维护一个步长，一直前移
     * @param nums
     */
    public static void method1(int[] nums){
        int step = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                step++;
                continue;
            }
            nums[i - step] = nums[i];
        }

        for(int i = nums.length - step; i < nums.length; i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 快慢指针，交换
     * @param nums
     */
    public static void method2(int[] nums){
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            while(nums[fast] == 0 && fast < nums.length){
                fast++;
            }

            if(nums[slow] == 0){
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }

            slow++;
            fast++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
