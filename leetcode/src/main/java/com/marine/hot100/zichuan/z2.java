package com.marine.hot100.zichuan;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 */
public class z2 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,2,5,3,6,7};
        int k = 3;
        int[] res = method1(nums, 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] method1(int[] nums, int k){
        int left = 1 - k;
        int right = 0;
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        while(right < nums.length){
            if(left > 0 && deque.peekFirst() == nums[left - 1]){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && deque.peekLast() < nums[right]){
                deque.removeLast();
            }

            deque.addLast(nums[right]);
            if(left >= 0){
                res[left] = deque.peekFirst();
            }
            right++;
            left++;
        }

        return res;

    }
}
