package com.marine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int reverse(int x) {
        // 将整数转换为字符串
        String numStr = Integer.toString(x);

        // 判断是否为负数
        boolean isNegative = false;
        if (numStr.charAt(0) == '-') {
            isNegative = true;
            numStr = numStr.substring(1); // 去掉负号
        }

        // 反转字符串
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();

        try {
            // 将反转后的字符串转换为整数
            int reversed = isNegative ? -Integer.parseInt(reversedStr.toString()) : Integer.parseInt(reversedStr.toString());
            return reversed;
        } catch (NumberFormatException e) {
            // 如果反转后的字符串超出了整数范围，返回0
            return 0;
        }
    }

    public static void main(String[] args) {
        int num = 0123;  // 输入以零开头的整数
        int reversed = reverse(num);
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reversed);
    }
}
