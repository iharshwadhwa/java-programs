package com.Harsh.OOPS.ExceptionHandling;

public class Stacktrace {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception o) {
          o.getMessage();
        }
    }
    public static void level3(){
        int[] array = new int[5];
            array[5] = 10;

    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
