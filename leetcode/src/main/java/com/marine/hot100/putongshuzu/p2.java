package com.marine.hot100.putongshuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并区间
 */
public class p2 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        method1(intervals);
    }

    public static void method1(int[][] intervals){
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
        System.out.println(Arrays.deepToString(intervals));
        int begin = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > end){
                res.add(new int[]{begin, end});
                begin = intervals[i][0];
                end = intervals[i][1];
            }else{
                end = Math.max(end, intervals[i][1]);
            }
        }
        res.add(new int[]{begin, end});

        System.out.println(Arrays.deepToString(res.toArray()));
    }
}
