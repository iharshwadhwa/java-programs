package com.Harsh.OOPS.Generics;

interface MathOperation{
    int Operate(int a,int b);
}


public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add= (a,b)->a+b;
        MathOperation mul = (a,b)->a*b;
        System.out.println(add.Operate(3,4));
        System.out.println(mul.Operate(2,3));
    }
}
