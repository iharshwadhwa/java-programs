package com.Harsh;
import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int HCF= computeHCF(a,b);
        int LCM= (a*b)/HCF;
        System.out.println("HCF"+HCF);
        System.out.println("LCM"+LCM);
    }
    static int computeHCF(int a,int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;

    }
}
