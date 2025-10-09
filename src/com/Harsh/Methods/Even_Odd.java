package com.Harsh.Methods;
import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Even_Odd(n);
    }
    static void Even_Odd(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
