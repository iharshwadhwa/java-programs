package com.Harsh.Basics;
import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        int computeHCF = HCF(a,b);
        int computeLCM = a*b/HCF(a,b);
        System.out.println(computeHCF);
        System.out.println(computeLCM);
    }
    static int HCF(int a,int b){
        while(b!=0){
           int temp =b;
           b=a%b;
           a=temp;
        }
        return a;
    }

}
