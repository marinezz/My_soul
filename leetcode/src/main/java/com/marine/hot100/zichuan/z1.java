package com.marine.hot100.zichuan;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为k的子数组
 */
public class z1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        method1(nums, k);
        method2(nums, k);
    }

    /**
     * 暴力法
     * @param nums
     * @param k
     */
    public static void method1(int[] nums, int k){
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    res++;
                }
            }
        }

        System.out.println(res);
    }

    public static void method2(int[] nums, int k){
        int pre = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            pre += nums[i];

            if(map.containsKey(pre - k)){
                res += map.get(pre - k);
            }

            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }

        System.out.println(res);
    }
}
