package com.Harsh.OOPS.Interfaces;

public class Electricengine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");
    }
}
