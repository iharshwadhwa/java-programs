package com.Harsh.OOPS;
import java.util.*;
public class Ques_6 {
    public static void main(String[] args) {
        int num=50;

        //boxing = primitive to object
        Integer boxednum = Integer.valueOf(num); //explicit boxing

        Integer unboxednum = boxednum.intValue(); //explicit unboxing

        System.out.println("original int "+num);
        System.out.println("boxing integer "+ boxednum);
        System.out.println("unboxing integer "+ unboxednum);
    }
}
