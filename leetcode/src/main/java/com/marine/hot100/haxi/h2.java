package com.marine.hot100.haxi;

import java.util.*;

/**
 * 字母异位词分组
 */

public class h2 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        method1(strs);
    }

    public static void method1(String[] strs){
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key =  new String(chars);

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s);

            map.put(key, list);
        }

        System.out.println(map.values());
    }

}
