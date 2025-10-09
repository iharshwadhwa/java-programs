package com.Harsh.Methods;
import java.util.*;
public class Range_of_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();

        Range(a,b);
    }
    static void Range(int start,int end){
        if(start<=1){
            start=2;
        }
        for(int i = start;i<=end;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
