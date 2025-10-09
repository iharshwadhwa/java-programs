package com.Harsh.Methods;
import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
    }

    static void eligible(int age){
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
