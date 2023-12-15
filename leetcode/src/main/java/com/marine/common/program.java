package com.marine.common;

import java.util.ArrayList;

/**
 * 记录常见的语法
 */
public class program {

    public static void main(String[] args) {
        length();
    }

    /**
     * 获取长度
     */
    public static void length(){
        // 获取字符串的长度 length()
        String s = new String("12345");
        System.out.println(s.length());

        // 获取数组长度 length
        int[] arr = new int[4];
        System.out.println(arr.length);

        // 获取集合长度 size()
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.size());
    }
}
