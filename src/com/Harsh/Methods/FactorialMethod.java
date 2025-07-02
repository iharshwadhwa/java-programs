package com.Harsh.Methods;
import java.util.*;
public class FactorialMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fact= sc.nextInt();
        System.out.println(factorial(fact));
    }
    static int factorial(int n){
        if(n<2){
            return 1;
        }
        return (n)*factorial(n-1);
    }
}
