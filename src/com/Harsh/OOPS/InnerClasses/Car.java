package com.Harsh.OOPS.InnerClasses;

public class Car {
    private String Model;
    private boolean isEngineOn;

    public Car( String model) {
        Model = model;
        this.isEngineOn = false;
    }

    class Engine{
        void start (){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(Model+" engine started.");
            }
            else{
                System.out.println(Model + " engine is already on.");
            }
        }
        void stop(){
            if(isEngineOn) {
                isEngineOn = false;

                System.out.println(Model + " engine stoped");
            }
            else{
                System.out.println(Model +" engine is already off ");
            }
        }
    }
}
