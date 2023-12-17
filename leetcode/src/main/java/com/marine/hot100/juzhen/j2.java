package com.marine.hot100.juzhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class j2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        method1(matrix);
    }

    public static void method1(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (true){
            for(int i = left; i <= right; i++){
                res.add(matrix[up][i]);
            }
            if(++up > down) break;;

            for(int i = up; i <= down; i++){
                res.add(matrix[i][right]);
            }
            if(--right < left) break;

            for(int i = right; i >= left; i--){
                res.add(matrix[down][i]);
            }
            if(--down < up) break;

            for(int i = down; i >= up; i--){
                res.add(matrix[i][left]);
            }
            if(++left > right) break;
        }

        System.out.println(Arrays.toString(res.toArray()));
    }
}
