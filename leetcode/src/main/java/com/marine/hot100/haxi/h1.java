package com.marine.hot100.haxi;

import java.util.*;

/**
 * 两数之和：
 * 题目需要返回int[],所以获得结果的时候，直接
 * return new int[]{i,j};
 * 即可，这样转来转去的很麻烦，还没有过
 */
public class h1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,7,11,15};
        int target = 9;

        method1(arr1, target);
        method2(arr1, target);
    }

    /**
     * 暴力双循环
     * @param arr1
     * @param target
     */
    public static void method1(int[] arr1,int target){
        int len = arr1.length;
        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(arr1[i] + arr1[j] == target){
                    res.add(i);
                    res.add(j);
                }
            }
        }

        System.out.println(Arrays.toString(res.toArray()));
    }

    /**
     * 利用HashMap
     */
    public static void method2(int[] nums, int target){
        if(nums.length < 2 || nums == null){
            return;
        }

        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];

            if(map.containsKey(temp)){
                res[0] = i;
                res[1] = map.get(temp);
            }

            map.put(nums[i], i);
        }

        System.out.println(Arrays.toString(res));
    }
}
