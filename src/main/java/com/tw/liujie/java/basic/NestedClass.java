package com.tw.liujie.java.basic;

/**
 * Created by jjliu on 8/11/14.
 */
class Out {
    private int age = 12;

    class In {
        private int age = 13;

        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out.this.age);
        }
    }


    public void Print(final int x) {
        final int age2 = 10;
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age2);
                System.out.println(age);
            }
        }
        new In().inPrint();
    }

    public Inner getInner(final String name, String city) {
        return new Inner(name, city) {
            private String nameStr = name;

            public String getName() {
                return nameStr;
            }
        };
    }
}

abstract class Inner {
    Inner(String name, String city) {
        System.out.println(city);
    }

    abstract String getName();
}

public class NestedClass {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}