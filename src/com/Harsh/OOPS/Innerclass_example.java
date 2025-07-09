package com.Harsh.OOPS;
import java.util.*;
public class Innerclass_example {
    class Outer{
        static class inner{
            void show(){
                System.out.println("Hello");
            }
        }
    }

    public static void main(String[] args) {
        Outer.inner obj1= new Outer.inner();
        obj1.show();
    }
}
