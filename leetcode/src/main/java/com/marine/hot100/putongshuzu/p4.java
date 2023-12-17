package com.marine.hot100.putongshuzu;

import java.util.Arrays;

/**
 *除自身以外的数组乘积
 */
public class p4 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] res = method2(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] method1(int[] nums){
        int count = 0;
        int product = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }else{
                product *= nums[i];
            }
        }

        if(count > 1){
            return  res;
        }else if(count == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    res[i] = product;
                }
            }
        }else {
            for(int i = 0; i < nums.length; i++){
                res[i] = product / nums[i];
            }
        }

        return res;
    }

    /**
     * 不使用除法
     */
    public static int[] method2(int[] nums){
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        res[nums.length - 1] = res[nums.length - 1];
        int right = nums[nums.length - 1];

        for(int i = nums.length -2; i > 0; i--){
            res[i] = res[i - 1] * right;
            right = right * nums[i];
        }

        res[0] = right;
        return  res;
    }
}
