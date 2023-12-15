package com.marine.hot100.zichuan;

/**
 * 最小覆盖字串
 */
public class z3 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        method1(s, t);
    }

    public static void method1(String s, String t){
        int[] need = new int[128];
        int left = 0, right = 0;
        int size = Integer.MAX_VALUE;
        int start = 0;
        int count = t.length();
        for (int i = 0; i < t.length(); i++){
            need[t.charAt(i)]++;
        }

        while (right < s.length()){
            if(need[s.charAt(right)] > 0){
                count--;
            }
            need[s.charAt(right)]--;

            if(count == 0){
                while(left < right && need[s.charAt(left)] < 0){
                    need[s.charAt(left)]++;
                    left++;
                }

                if(right - left + 1 < size){
                    size = right - left + 1;
                    start = left;
                }

                // 跳出循环
                need[s.charAt(left)]++;
                left++;
                count++;
            }

            right++;
        }

        System.out.println(s.substring(start, start + size));
    }
}
