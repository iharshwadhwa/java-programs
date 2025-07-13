package com.Harsh.OOPS.Interfaces;

public class Car implements Engine, Brake{

    int a =30;

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car");
    }
}
