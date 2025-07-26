package com.Harsh.OOPS.Interfaces;

public class Airplane implements Flyable{
    String model;
    public Airplane(String model){
        this.model=model;
    }
    @Override
    public void takeoff(){
        System.out.println(model+" uses runway to takeoff");
    }
    @Override
    public void land(){
        System.out.println(model+" lands on a runway");
    }


}
