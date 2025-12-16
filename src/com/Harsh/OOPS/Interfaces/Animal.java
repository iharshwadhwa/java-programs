package com.Harsh.OOPS.Interfaces;

public interface Animal {

    int MAX_AGE=150;

    public abstract void eat();

    public static void info(){
        System.out.println("This is an animal interface");
    }

    default void run(){ //concrete method
        this.eat();
        System.out.println("Animal is running");
    }

    void sleep();    //they are already abstract and public no need to write again
}
