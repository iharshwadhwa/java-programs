package com.Harsh.Basics;
import java.util.*;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num); //if u give int input it will automatically convert to float
        int num = (int) (67.56f);
       // System.out.println(num);

//        //automatic type promotion in expressions
//        int a =257;
//        byte b =(byte)a;  //maximum range of byte variables is 256 we can't store 257 while maximum value is 256 so it will give a remainder
        // 257%256
        //System.out.println(b);


//        byte a = 40;
//        byte b =50;
//        byte c = 100;
//        int d = (a*b)/c;  //java automatically promoting each byte to integer while calculating/ performing function
//        System.out.println(d);

//        byte b = 50;
//        b=b*2; //cant do it without explicit casting

//        int number = 'a';
//        System.out.println(number); //java follows unicode principle

        byte b = 42;
        char c= 'a';
        short s= 1024;
        int i =50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);


    }
}
