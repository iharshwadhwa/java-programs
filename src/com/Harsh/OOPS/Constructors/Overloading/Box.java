package com.Harsh.OOPS.Constructors.Overloading;

public class Box {
    int l;
    int b;
    int h;
    Box(){
        l=b=h=1;
    }
    Box(int side){
        l=b=h=side;
    }
    Box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    void volume(){
        System.out.println(l*b*h);
    }

    public static void main(String[] args) {
        Box b1= new Box();
        Box b2 = new Box(10);
        Box b3= new Box(5,4,3);
        b1.volume();
        b2.volume();
        b3.volume();
    }
}
