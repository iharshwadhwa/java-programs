package com.Harsh.ConditionalLoops;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int next=0;
        for(int i =3;i<=n;i++){
            next = a+b;
            a=b;
            b=next;
        }
        System.out.println(next);

    }
}
