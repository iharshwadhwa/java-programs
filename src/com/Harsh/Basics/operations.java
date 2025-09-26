package com.Harsh.Basics;
import java.util.*;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().trim().charAt(0);

        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            if (a != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Not defined");
            }
        } else {
            System.out.println("invalid value");
        }
    }
}
