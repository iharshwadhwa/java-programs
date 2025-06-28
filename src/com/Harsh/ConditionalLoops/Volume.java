package com.Harsh.ConditionalLoops;
import java.util.*;
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        double r = sc.nextDouble();
//        double h = sc.nextDouble();
//
//        double volume = (Math.PI*(r*r*h))/3;
//        System.out.println(volume);
//        double length = sc.nextDouble();
//        double width= sc.nextDouble();
//        double BA= length*width;
//        double H= sc.nextDouble();
//        double volume=1.0/3*BA*H;
//        System.out.println(volume);
        double length = sc.nextDouble();
        double width= sc.nextDouble();
        double BA= length*width;
        double H= sc.nextDouble();
        double volume=BA*H;
        System.out.println(volume);
    }
}
