package com.Harsh.Methods;
import java.util.*;
public class Min_And_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c =sc.nextInt();

        System.out.println(Max(a,b,c));
        System.out.println(Min(a,b,c));
    }

    static int Max(int a,int b,int c){
        int max= a;
        if(b>max){
            max=b;
        }
       if(c>max){
            max=c;
        }

        return max;
    }

    static int Min(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
       if(c<min){
            min=c;
        }
        return min;
    }
}
