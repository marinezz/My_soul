package com.marine.hot100.juzhen;

import java.util.Arrays;

/**
 * 矩阵置零
 *
 */
public class j1 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1}};
        method1(matrix);
    }

    /**
     * 使用一个额外的数组
     * @param matrix
     */
    public static void method1(int[][] matrix){
        int[] rowArr = new int[matrix.length];  // 行
        int[] rankArr = new int[matrix[0].length];  // 列
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rowArr[i]++;
                    rankArr[j]++;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            if(rowArr[i] > 0){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
                continue;
            }
            for(int j = 0; j < matrix[0].length; j++){
                if(rankArr[j] > 0){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    /**
     * 使用额外的两个数
     * @param matrix
     */
    public static void method2(int[][] matrix){
        int row = matrix.length;;
        int col = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0){
                rowZero = true;
            }
        }

        for(int i = 0; i < col; i++){
            if(matrix[0][i] == 0){
                colZero = true;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][0] ==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowZero){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;

            }
        }

        if(colZero){
            for(int i = 0; i < col; i++){
                matrix[0][i] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
