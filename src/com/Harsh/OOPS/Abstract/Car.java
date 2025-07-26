package com.Harsh.OOPS.Abstract;

public class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }
    public void Refuel(){
        System.out.println(brand+" is refuelling with petrol");
    }
}
