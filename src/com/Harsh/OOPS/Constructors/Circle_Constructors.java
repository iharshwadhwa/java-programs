package com.Harsh.OOPS.Constructors;
import java.util.*;
public class Circle_Constructors {
    public static void main(String[] args) {
        Circle c1= new Circle(5.5);
        c1.calculateArea();
    }
}
class Circle{
    double radius;
    double area;

    Circle(double radius){
        this.radius=radius;
        area= Math.PI*radius*radius;

    }
    void calculateArea(){
        System.out.println("Area of circle is: "+area);
    }
}
