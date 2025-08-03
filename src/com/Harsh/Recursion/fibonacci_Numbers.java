package com.Harsh.Recursion;

public class fibonacci_Numbers {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    static int fibo(int n){
        if(n<=2){
            return 1;
        }
       int fibonacci = fibo(n-1)+fibo(n-2);
        return fibonacci;
    }
}
