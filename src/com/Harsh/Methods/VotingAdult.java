package com.Harsh.Methods;
import java.util.*;
public class VotingAdult {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age(age));

    }
    static String age(int n){
        if(n<=18){
            return "Not Eligible";
        }
        return "Eligible";
    }
}
