package com.Harsh;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            int original = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            int temp = i;
            while (temp > 0) {
                int digit = temp / 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
