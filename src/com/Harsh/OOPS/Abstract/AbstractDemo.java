package com.Harsh.OOPS.Abstract;

public class AbstractDemo {
    public static void main(String[] args) {
        Car mycar= new Car("Honda");
        mycar.startEngine();
        mycar.Refuel();
        mycar.StopEngine();

        System.out.println("---");

        ElectricCar myElectricCar= new ElectricCar("tesla");
        myElectricCar.startEngine();
        myElectricCar.Refuel();
        myElectricCar.StopEngine();

//        Vehicle myVehicle= new Vehicle("Generic") {
//        }
    }
}
