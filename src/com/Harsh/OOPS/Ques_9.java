package com.Harsh.OOPS;
import java.util.*;
public class Ques_9 {
    public static void main(String[] args) {
        Phone p1= new Phone();
        p1.display();
        Phone p2= new Phone("Apple");
        p2.display();
        Phone p3 = new Phone("Samsung",100000);
        p3.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone name");
        String name = sc.nextLine();
        System.out.println("Enter phone price");
        int price = sc.nextInt();

        Phone p4 = new Phone(name,price);
        p4.display();


    }
    static class Phone{
        String name;
        int price;

        Phone(){
            this("unknown");
            System.out.println("Default constructor called");
        }
        Phone(String name){
            this(name,32000);
            System.out.println("constructor with 1 parameter is called");
        }
        Phone(String name,int price){
            this.name = name;
            this.price=price;
            System.out.println("constructor with 2 parameter is called");
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("price: "+price);
        }
    }
}
