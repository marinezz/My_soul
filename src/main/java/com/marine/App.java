package com.marine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String a = "abcde";
        String b = "abc";
        String c = b + "de";

        String s=new String("abc")+new String("de");
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(s.hashCode());
    }
}
