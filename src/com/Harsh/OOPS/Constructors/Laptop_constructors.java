package com.Harsh.OOPS.Constructors;
import java.util.*;
public class Laptop_constructors {
    public static void main(String[] args) {
        Laptop l1= new Laptop();
    }
}
class Laptop{
    String brand;
    int price;

    Laptop(){
        this("Lenovo",52000);
    }
    Laptop(String brand,int price){
        this.brand=brand;
        this.price=price;
        display();
    }
    void display(){
        System.out.println("brand is: "+brand+" & price is: "+price);
    }
}
