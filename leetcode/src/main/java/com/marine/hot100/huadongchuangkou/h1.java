package com.marine.hot100.huadongchuangkou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class h1 {
    public static void main(String[] args) {
        String s = "abba";
        method1(s);
    }

    public static void method1(String s){
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int index = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){

            /**
             * 1、首先，判断当前字符是否包含在map中，如果不包含，将该字符添加到map（字符，字符在数组下标）,
             *              此时没有出现重复的字符，左指针不需要变化。此时不重复子串的长度为：i-left+1，与原来的maxLen比较，取最大值；
             *
             * 2、如果当前字符 ch 包含在 map中，此时有2类情况：
             *    1）当前字符包含在当前有效的子段中，如：abca，当我们遍历到第二个a，当前有效最长子段是 abc，我们又遍历到a，
             *       那么此时更新 left 为 map.get(a)+1=1，当前有效子段更新为 bca；
             *    2）当前字符不包含在当前最长有效子段中，如：abba，我们先添加a,b进map，此时left=0，我们再添加b，发现map中包含b，
             *       而且b包含在最长有效子段中，就是1）的情况，我们更新 left=map.get(b)+1=2，此时子段更新为 b，而且map中仍然包含a，map.get(a)=0；
             *       随后，我们遍历到a，发现a包含在map中，且map.get(a)=0，如果我们像1）一样处理，就会发现 left=map.get(a)+1=1，实际上，left此时
             *       应该不变，left始终为2，子段变成 ba才对。
             */
            if(map.containsKey(chars[i])){
                index = Math.max(index, map.get(chars[i]) + 1);
            }

            map.put(chars[i], i);

            res = Math.max(res, i - index + 1);
        }

        System.out.println(res);
    }
}
