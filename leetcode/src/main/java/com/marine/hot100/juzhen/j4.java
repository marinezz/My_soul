package com.marine.hot100.juzhen;

/**
 * 搜索二维矩阵
 */
public class j4 {
    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        int target = -10;
        boolean b = method1(matrix, target);
        System.out.println(b);
    }

    public static boolean method1(int[][] matrix, int target){
        int row = matrix.length - 1;
        int col = 0;
        int flag = matrix[row][col];
        while(flag != target){
            if(flag > target){
                row--;
            }else{
                col++;
            }
            if(row < 0 || col == matrix[0].length){
                return false;
            }

            flag = matrix[row][col];
        }

        return true;
    }

    /**
     * 同样的思想，换一种写法
     * @param matrix
     * @param target
     */
    public static boolean method2(int[][] matrix, int target){
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length){
            if(matrix[i][j] < target){
                j++;
            }else if(matrix[i][j] > target){
                i--;
            }else{
                return true;
            }
        }

        return false;
    }
}
