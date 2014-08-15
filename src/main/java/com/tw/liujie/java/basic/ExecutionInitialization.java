package com.tw.liujie.java.basic;
/**
 * Created by jjliu on 8/10/14.
 */
class Parent {
    // Static variables
    public static String p_StaticField = "ParentClass--Static variables";
    // variables
    public String p_Field = "ParentClass--Variables";
    String name;
    // Static Initial block
    static {
        System.out.println(p_StaticField);
        System.out.println("ParentClass--Static Initial block");
    }
    // Initial block
    {
        System.out.println(p_Field);
        System.out.println("ParentClass--Initial block");
    }
    // Constructor
    public Parent() {
        System.out.println("ParentClass--Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class SubClass extends Parent {
     String name;
    // Static variables
    public static String s_StaticField = "SubClass--Static variables";
    // variables
    public String s_Field = "SubClass--Variables";
    // Static Initial block
    static {
        System.out.println(s_StaticField);
        System.out.println("SubClass--Static Initial block");
    }
    // Initial block
    {
        System.out.println(s_Field);
        System.out.println("SubClass--Initial block");
    }
    // Constructor
    public SubClass() {
        System.out.println("SubClass--Constructor");
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
class SubClass2 extends  Parent{

}

public class ExecutionInitialization{
    // main
    public static void main(String[] args) {
        SubClass subClass= new SubClass();
        subClass.setName("test");
        System.out.println("subClass = " +subClass.name);

        Parent parent=subClass;
        System.out.println("parent = " +parent.name);

    }

}