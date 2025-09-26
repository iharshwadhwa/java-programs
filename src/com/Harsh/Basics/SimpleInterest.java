package com.Harsh.Basics;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float t= sc.nextFloat();
        float r = sc.nextFloat();;
        double si = (p*r*t)/100;
        System.out.println(si);
    }
}
