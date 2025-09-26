package com.Harsh.Basics;
import java.util.*;
public class FIbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;    //upto n numbers
        int b=1;
        int fib=0;
        for(int i = 2 ;i<=n;i++){
            fib= a+b;
            a=b;
            b=fib;
        }
        System.out.println(b);

//        nth fibonacci number
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        for(int i = 0 ;i<=n;i++){
//            int fib= a+b;
//            a=b;
//            b=fib;
//            System.out.println(b);
//        }
    }
}
