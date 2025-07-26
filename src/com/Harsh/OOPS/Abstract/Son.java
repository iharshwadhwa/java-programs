package com.Harsh.OOPS.Abstract;

public class Son extends Parent{
    public Son(int age){
        this.age=age;
    }
    @Override
    void career(){
        System.out.println("I'm going to be a doctor ");
    }
    @Override
    void partner(){
        System.out.println("I love pepper pots ");
    }
}
