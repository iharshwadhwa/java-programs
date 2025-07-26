package com.Harsh.OOPS.Abstract;

public class ElectricCar extends Vehicle {
    public ElectricCar(String brand){
        super(brand);
    }
    public void Refuel(){
        System.out.println(brand+" is charging its battery");
    }
}
