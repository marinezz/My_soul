package com.marine.hot100.haxi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 最长连续序列
 */
public class h3 {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        method1(nums);
        method2(nums);
    }

    /**
     * 排序，然后计算出最长的长度
     * @param nums
     */
    private static void method1(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int res = 1;
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                len++;
                res = Math.max(res, len);
            }else if(nums[i] == nums[i - 1]){  // 重复数字则跳过本次循环
                continue;
            }else{
                len = 1;
            }
        }

        System.out.println(res);
    }

    /**
     * 先使用hash去重，然后使用set去重
     * 然后遍历，遇到还有更小的则跳过
     * 如果没有更小的，则开始计数
     * @param nums
     */
    public static void method2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int res = 0;
        int len = 1;
        for(int i : set){
            if(!set.contains(i - 1)){
                while(set.contains(i+1)){
                    len++;
                    i++;
                }
            }
            res = Math.max(res, len);
            len = 1;
        }

        System.out.println(res);
    }
}
