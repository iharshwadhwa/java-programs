package com.Harsh.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3,4));
        shape.area();
        circle.area();
        square.area();
    }
}
