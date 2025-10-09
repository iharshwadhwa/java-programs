package com.Harsh.Methods;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(prime(n));
    }
    static boolean prime(int n){
        boolean isprime = true;
        if(n<=1){
            isprime =false;
        }
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
