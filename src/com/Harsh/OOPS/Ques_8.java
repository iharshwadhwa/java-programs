package com.Harsh.OOPS;
import java.util.*;
public class Ques_8 {
    public static void main(String[] args) {
        Testfinal f1= new Testfinal();
        f1.display();

    }
   static class Testfinal{
        final int MAX= 5;
        int b=6;
        void display(){
            System.out.println("MAX: " +MAX);
            System.out.println("b: "+b);
        }
    }
}
