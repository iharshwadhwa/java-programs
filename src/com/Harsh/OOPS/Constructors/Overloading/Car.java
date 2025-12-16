package com.Harsh.OOPS.Constructors.Overloading;

public class Car {
    String brand;
    int year;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        Car c1= new Car("BMW");
        Car c2= new Car("Bugatti",2025);
        System.out.println(c1.brand);
        System.out.println(c2.brand+" "+c2.year);
    }
}
