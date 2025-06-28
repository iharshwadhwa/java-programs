package com.Harsh;
import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        float INR = sc.nextFloat();

        float USD = INR/83;

        System.out.println("$ "+USD);
        sc.close();
    }
}
