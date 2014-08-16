package com.tw.liujie.java.basic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jjliu on 8/14/14.
 */
public class MutipleThreadHashMap {

    public static void main(String[] args) {
        new MutipleThreadHashMap().test();


    }

//    private Map<String, String> map = new HashMap<String, String>();
    private Map<String, String> map = new ConcurrentHashMap<String, String>();

    int i=100000;

    public void test() {
        new Thread() {
            public void run() {
                for (int j = 0; j < i; j++) {
                    map.put("ka" + j, j + "");
                    System.out.println("1put"+j);
                }

            }
        }.start();

        new Thread() {
            public void run() {
                for (int j = 0; j < i; j++) {
                    map.put("kb" + j, j + "");
                    System.out.println("1put"+j);
                }
            }
        }.start();
    }
}
