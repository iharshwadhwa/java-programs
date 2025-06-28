package com.Harsh;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int P = sc.nextInt();
        float R = sc.nextFloat();
        int T = sc.nextInt();

        float SI = (P*R*T)/100;

        System.out.println(SI);
    }
}
