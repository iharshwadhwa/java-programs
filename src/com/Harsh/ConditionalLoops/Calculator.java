package com.Harsh.ConditionalLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double b = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;

            case '-':
                result = a - b;
                System.out.println(result);
                break;

            case '*':
                result = a * b;
                System.out.println(result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println(result);
                } else {
                    System.out.println("Can't");
                }
                break;

            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println(result);
                } else {
                    System.out.println(" Can't");
                }
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
