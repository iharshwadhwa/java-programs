package com.Harsh;
import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n>=40){
            System.out.println("Hot");
        }
        else if(n>=20 && n<=30){
            System.out.println("Normal");
        }
        else if(n<20){
            System.out.println("Cold");
        }

    }
}
