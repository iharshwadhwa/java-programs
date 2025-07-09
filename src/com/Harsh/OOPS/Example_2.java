package com.Harsh.OOPS;
import java.util.*;
public class Example_2 {
//    static class MathUtil{
//        static int square(int x){
//            return x*x;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(MathUtil.square(5));
//    }
    class Example {
    static {
        System.out.println("Static block runs only once");
    }

    Example() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

    }
}
}
