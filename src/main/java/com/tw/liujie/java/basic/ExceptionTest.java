package com.tw.liujie.java.basic;

/**
 * Created by jjliu on 8/12/14.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("return "+method());
    }

    public static int method() {
        int i = 0;
        String s = "null";
        try {
            s.toString();
            System.out.println("-try-");
            return i;
        } catch (Exception e) {
            System.out.println("-catch-");
            e.printStackTrace();
        }
        finally {
            System.out.println("-finally-");
            i = 1;
        }
        i=2;
        return i;
    }
}
