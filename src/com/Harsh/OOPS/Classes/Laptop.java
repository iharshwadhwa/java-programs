package com.Harsh.OOPS.Classes;

public class Laptop {
    String brand;
    int price;

    void showdetails(){
        System.out.println("Brand name is: "+brand+" Price is: "+price);
    }
    public static void main(String[] args) {
        Laptop l1= new Laptop();
        l1.brand = "Lenovo";
        l1.price = 95000;
        l1.showdetails();

        Laptop l2= new Laptop();
        l2.brand= "Asus";
        l2.price = 56000;
        l2.showdetails();
    }
}

