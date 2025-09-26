package com.Harsh.Basics;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int original = n;
        int reversed =0;

        while(n>0){
            int digit=n%10;
            reversed = reversed*10+digit;
            n/=10;
        }
        if(reversed==original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
