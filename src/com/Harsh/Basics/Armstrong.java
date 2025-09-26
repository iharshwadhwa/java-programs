package com.Harsh.Basics;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

        static boolean isArmstrong ( int num){
            int original = num;
            int digits = String.valueOf(num).length();
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            return sum == original;

        }
    }
