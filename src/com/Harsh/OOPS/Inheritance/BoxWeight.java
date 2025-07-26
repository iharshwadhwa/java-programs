package com.Harsh.OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //calls the parent class constructor
        //used to intialize values present in parent class
//        System.out.println(super.weight);
        System.out.println(this.weight);
        this.weight = weight;
    }
}
