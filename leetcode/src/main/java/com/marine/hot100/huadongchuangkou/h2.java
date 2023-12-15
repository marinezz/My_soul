package com.marine.hot100.huadongchuangkou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class h2 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> integers = method1(s, p);
        System.out.println(Arrays.toString(integers.toArray()));
    }

    public static List<Integer> method1(String s, String p){
        List<Integer> res = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if(sLen < pLen){
            return res;
        }

        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for(int i = 0; i < pLen; i++){
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(pArr, sArr)){
            res.add(0);
        }

        for(int i = 0; i < sLen - pLen; i++){
            sArr[s.charAt(i) - 'a']--;
            sArr[s.charAt(pLen + i) - 'a']++;
            if(Arrays.equals(pArr, sArr)){
                res.add(i + 1);
            }
        }

        return res;
    }
}
