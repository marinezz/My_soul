package com.marine.hot100.shuangzhizhen;

/**
 * 盛最多的水：下标之差✖两个值的最小值
 */
public class s2 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        method1(height);
        method2(height);
    }

    /**
     * 暴力法，超出时间限制
     * @param height
     */
    public static void method1(int[] height){
        int res = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++) {
                int contains = Math.min(height[i], height[j]) * (j - i);
                res = Math.max(res, contains);
            }
        }

        System.out.println(res);
    }

    /**
     * 双指针法，如果移动之后，最短的变长了，容积可能变大
     * 如果移动之后不变或者变小，容积一定变小
     * 所以移动短的那一根，才会有变大的可能，然后取最大值
     * @param height
     */
    public static void method2(int[] height){
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int contains = (right - left) * Math.min(height[left], height[right]);
            res = Math.max(contains, res);
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(res);
    }
}
