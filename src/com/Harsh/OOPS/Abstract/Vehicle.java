package com.Harsh.OOPS.Abstract;

abstract public class Vehicle {
    String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }
    public void startEngine(){
        System.out.println(brand+" start Engine");
    }
    public abstract void Refuel();
    public void StopEngine(){
        System.out.println(brand+" Stop Engine");
    }
}
