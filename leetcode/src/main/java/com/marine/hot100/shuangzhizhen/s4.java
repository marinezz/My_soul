package com.marine.hot100.shuangzhizhen;

/**
 * 接雨水
 * 接住的雨水是两个最大高度中，最小的值来决定的
 */

public class s4 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        method1(height);
        method2(height);
    }

    /**
     * 用两个数组记录两边的最大值
     * @param height
     */
    public static void method1(int[] height){
        int res = 0;

        int len = height.length;
        int[] heightLeft = new int[len];
        int[] heightright = new int[len];
        int max = 0;
        for(int i = 0; i < len; i++){
            max = Math.max(max, height[i]);
            heightLeft[i] = max;
        }
        max = 0;
        for(int i = len - 1; i >= 0; i--){
            max = Math.max(max, height[i]);
            heightright[i] = max;
        }

        for(int i = 0; i < len; i++){
            res += Math.min(heightLeft[i], heightright[i]) - height[i];
        }

        System.out.println(res);
    }

    /**
     * 双指针法，动态的维护两端的值
     * @param height
     */
    public static void method2(int[] height){
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int heightLeft = height[left];
        int heightRight = height[right];
        while(left < right){
            if(heightLeft < heightRight){
                res += heightLeft - height[left];
                left++;
                heightLeft = Math.max(heightLeft, height[left]);
            }else{
                res += heightRight - height[right];
                right--;
                heightRight = Math.max(heightRight, height[right]);
            }
        }

        System.out.println(res);
    }
}
