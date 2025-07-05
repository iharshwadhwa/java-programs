package com.Harsh.OOPS;
import java.util.*;
public class Ques_4 {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.show();

        Pen p2 = new Pen("Parker");
        p2.show();

        Pen p3 = new Pen("Reynolds", "Blue");
        p3.show();
    }

    static class Pen{
        String brand;
        String color;

        Pen(){
            this("Unknown");
            System.out.println("Default Constructor called");
        }
        Pen(String brand){
            this(brand,"Blue");
            System.out.println("Constructor 2 with 1 parameter is called");
        }
        Pen(String brand, String Color){
            this.brand= brand;
            this.color = color;
            System.out.println("Constructor with 2 parameters is called");
        }

        void show(){
            System.out.println("Brand: "+ brand);
            System.out.println("Color: "+ color);
        }

    }
}
