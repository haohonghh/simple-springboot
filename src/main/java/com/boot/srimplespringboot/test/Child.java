package com.boot.srimplespringboot.test;

public class Child extends Parent {


    public String test() {

       return super.myTest();
    }


    public String getName() {
            name = "abc";
        return name;
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
    }

}
