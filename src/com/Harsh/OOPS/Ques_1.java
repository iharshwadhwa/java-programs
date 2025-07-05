package com.Harsh.OOPS;
import java.util.*;
public class Ques_1 {
    public static void main(String[] args) {

        Laptop l1= new Laptop();
        Laptop l2 = new Laptop("Hp");
        Laptop l3= new Laptop("Dell",60000);

        System.out.println("Laptop l1");
        l1.display();
        System.out.println("laptop l2");
        l2.display();
        System.out.println("laptop l3");
        l3.display();

    }

    static class Laptop{
        String brand;
        int price;

        Laptop(){
            brand = "Asus";
            price = 0;
        }
        Laptop(String brand){
            this.brand= brand;
            this.price=0;
        }
        Laptop(String brand, int price){
            this.brand = brand;
            this.price= price;
        }
        void display(){
            System.out.println("Brand "+brand);
            System.out.println("Price "+price);
        }
    }
}
