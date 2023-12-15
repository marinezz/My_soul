package com.marine.hot100.putongshuzu;

import java.util.Arrays;

/**
 * 轮转数组
 */
public class p3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        method2(nums, k);
    }

    /**
     * 利用额外空间
     * @param nums
     * @param k
     */
    public static void method(int[] nums, int k){
        k = k % nums.length;
        int[] temp = new int[k];
        int j = 0;
        for(int i = nums.length - k; i < nums.length; i++){
            temp[j] = nums[i];
            j++;
        }

        for(int i = nums.length - 1; i >= k; i--){
            nums[i] = nums[i - k];
        }

        for(int i =0; i < k; i++){
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 数组反转
     * @param nums
     * @param k
     */
    public static void method2(int[] nums, int k){
        k = k % nums.length;
        reverse(nums,0, nums.length - k  - 1);
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0 , nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int begin, int end){
        while(begin < end){
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
    }
}
