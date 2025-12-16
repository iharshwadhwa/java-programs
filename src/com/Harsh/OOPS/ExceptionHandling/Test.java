package com.Harsh.OOPS.ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        int[] numerators = {10,200,30,40};
        int[] denominators = {1,2,0,4};

        for(int i =0;i< numerators.length;i++){
            System.out.println(divide(numerators[i],denominators[i]));
        }
        System.out.println("Good Job :)");
    }
    static int divide(int a,int b) {
        try {
            return a / b;
        } catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
