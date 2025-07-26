package com.Harsh.OOPS.Inheritance;

public class Box {
    private double l;
    double h;
    double w;
    double weight;

    Box(){
        this.l = -1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        super(); //to call the constructor of object class
        this.w = side;
        this.l = side;
        this.h= side;
    }
    Box(double l, double h,double w){
        System.out.println("Box class constructor");
        this.w = w;
        this.l = l;
        this.h= h;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void display(){
        System.out.println("Running the box");
    }
}
