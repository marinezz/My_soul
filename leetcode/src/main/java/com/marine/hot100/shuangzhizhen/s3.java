package com.marine.hot100.shuangzhizhen;

import java.util.*;

/**
 * 三数之和
 * 这题的主要关键是去重
 * 先排序，然后锁定一个值，然后利用双指针取寻找另外两个值
 */
public class s3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        method01(nums);
    }

    public static void method01(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            // 跳过一个
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    List<Integer> item = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(item);
                    // 有多个重复的时候需要跳过
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        System.out.println(Arrays.toString(res.toArray()));
    }
}
