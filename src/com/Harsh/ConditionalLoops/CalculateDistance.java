package com.Harsh.ConditionalLoops;
import java.sql.SQLOutput;
import java.util.*;
public class CalculateDistance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        Double Speed= sc.nextDouble();
//        Double Time= sc.nextDouble();
//        Double Distance = Speed*Time;
//        System.out.println(Distance);
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double y2=sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(distance);

    }
    }

