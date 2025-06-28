package com.Harsh;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = 0;
        int c = 1;
        int next =0;
        for (int i =3; i <=a; i++) {
            next = b + c;
            b = c;
            c = next;
        }
        System.out.println(next);

        sc.close();
    }

}
