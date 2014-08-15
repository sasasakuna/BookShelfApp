package com.tw.liujie.java.basic;

/**
 * Created by jjliu on 8/10/14.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = "test";
        String s3 = "test";
        String s4 = s2;
        String s5 = new String("test");

        System.out.println(s2 == "test");//true
        System.out.println(s2 == s3);//true
        System.out.println(s2 == s4);//true
        System.out.println(s1 == s5);//false
        System.out.println(s1 == s2);//false
        System.out.println(s1 == "test");//false

        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



    }
}
