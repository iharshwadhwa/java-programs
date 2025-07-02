package com.Harsh.Methods;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isprime(a));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
