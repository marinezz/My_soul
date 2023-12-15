package com.marine.hot100.putongshuzu;

/**
 * 最大数组和
 */
public class p1 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        method1(nums);
        method2(nums);
    }

    public static void method1(int[] nums){
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i -  1] < 0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i - 1] + nums[i];
            }
            res = Math.max(res, dp[i]);
        }

        System.out.println(res);
    }

    public static void method2(int[] nums){
        int res = nums[0];
        int dp = nums[0];

        for(int i = 1; i < nums.length; i++){
            dp = Math.max(nums[i], dp + nums[i]);
            res = Math.max(res, dp);
        }

        System.out.println(res);
    }
}
