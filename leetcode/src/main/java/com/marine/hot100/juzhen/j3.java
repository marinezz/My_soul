package com.marine.hot100.juzhen;

import java.util.Arrays;

/**
 * 旋转图像
 */
public class j3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        method1(matrix);
    }

    public static void method1(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){
            for(int j = i; j < col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < row; i++){
            int left = 0;
            int right = col - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
