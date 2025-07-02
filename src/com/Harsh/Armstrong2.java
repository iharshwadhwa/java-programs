package com.Harsh;
import java.util.*;
public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n> 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }


        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}


