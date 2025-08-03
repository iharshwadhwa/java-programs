package com.Harsh.Recursion;

public class FibonacciMethods {
    public static void main(String[] args) {
        System.out.println("Recursive (slow): " + fiboRecursive(30));  // Avoid 50 here
        System.out.println("Formula: " + fiboFormula(50));
        System.out.println("DP (fast): " + fiboDP(50));
    }

    // 1. Recursive (slow)
    static int fiboRecursive(int n) {
        if (n <= 2) return 1;
        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }

    // 2. Closed-form formula (fast, approx)
    static long fiboFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    // 3. Dynamic Programming (fast and accurate)
    static long fiboDP(int n) {
        if (n <= 2) return 1;
        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
