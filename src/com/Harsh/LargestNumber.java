package com.Harsh;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int p = sc.nextInt();
        int a= sc.nextInt();

        int temp =0;

        if(n>temp){
            temp =n;
        }
        if(p>temp){
            temp = p;
        }
        System.out.println(temp);

//        System.out.println(Math.max(a,Math.max(n,p)));
    }
}
