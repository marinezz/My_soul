package com.marine.common;

import java.util.Arrays;

/**
 * 常见的几种排序算法
 */
public class sort {
    public static void main(String[] args) {
        int[] nums = {6,1,4,2,5,6,8,9,2,3};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 冒泡排序
     * 思想：每次都把一个最大值，放在最后后面，像冒泡一样
     * 可以优化的点：
     * 1、 不论是否已经有序了，都会遍历完，可以用一个标志位，如果一次遍历都没有调整位置，则可以直接退出
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(nums[j + 1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * 思想：每次都让前i个数字有序，只需要把i+1个插入到有序的列表中去
     * @param nums
     */
    public static void insertSort(int[] nums){
        int len = nums.length;
        for(int i = 1; i < len; i++){
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0){
                if(nums[j] > temp){
                    nums[j + 1] = nums[j];
                    j--;
                }else{
                    break;
                }
            }
            nums[j + 1] = temp;
        }
    }
}
