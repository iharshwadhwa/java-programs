package com.Harsh.OOPS.Abstract;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age=age;
    }
   // abstract Parent();
    //no

    static void hello(){
        System.out.println("static");
    }

    void hi(){
        System.out.println("Normal");
    }


    abstract void career();
    abstract void Partner();

}
