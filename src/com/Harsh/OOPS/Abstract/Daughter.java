package com.Harsh.OOPS.Abstract;

public class Daughter extends Parent{
    public Daughter(int age){
        this.age=age;
    }
    @Override
    void career(){
        System.out.println("I'm going to be a Coder");
    }

    @Override
    void partner(){
        System.out.println("I love iron man");
    }
}
