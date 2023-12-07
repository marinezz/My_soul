package com.marine.interview;

import java.util.Scanner;

/**
 * 百度面试：整数反转
 *
 * 面试官反问：如果整数为0123这种，怎么做？
 * 解答：如果是以0开头的话，java会将之识别为八进制，然后自动转换成十进制，这里就是83，然后再进行反转，结果是38
 * 原因知道了，暂时无解
 */

public class reverseInt {
    // 利用取余
    public static int reverse(int a){
        int res = 0;
        while(a != 0){
            // 检查溢出
            if(res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE){
                return 0;
            }
            int temp = a % 10;
            res = res * 10 + temp;
            a /= 10;
        }

        return res;
    }

    // 转成字符串再进行反转
    public static int resverseString(int a){
        String s = Integer.toString(a);

        boolean flag = true;  // 记录是正数还是负数
        if(s.charAt(0) == '-'){
            flag = false;
            s = s.substring(1);  // 只获取数字
        }

        StringBuilder sb = new StringBuilder(s).reverse();  // 反转

        if(flag){
            int res = Integer.parseInt(sb.toString());
            return res;
        }else {
            int res = -Integer.parseInt(sb.toString());
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个整数：");
        int a = sc.nextInt();
        System.out.println("整数反转为：" + reverse(a));
        System.out.println("字符串拼接：" + resverseString(a));
    }
}
