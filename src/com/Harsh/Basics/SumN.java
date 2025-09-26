package com.Harsh.Basics;
import java.util.*;
public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        while(n>0) {
            int digits = n % 10;
            sum+=digits;
            n/=10;
        }
        System.out.println(sum);
    }
}
