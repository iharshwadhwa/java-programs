package com.Harsh.Methods;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(ispalindrome(n));
    }
    static boolean ispalindrome(int n){
        int original =n;
        int reversed =0;

        while(n>0){
            int digits=n%10;
            reversed=reversed*10+digits;
            n/=10;
        }
        if (original==reversed){
            return true;
        }

        return false;
    }

}
