package com.Harsh.OOPS.Abstract;

public class Son extends Parent {

    public Son(int age){
        super(20);
    }
    @Override
    void career() {
        System.out.println("I'm going to be a Doctor");
    }

    @Override
    void Partner() {
        System.out.println("I love iron man");

    }
}
