package com.Harsh.Methods;
import java.util.*;
public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Minimum(a,b,c));
        System.out.println(Maximum(a,b,c));
    }
    static int Minimum(int a,int b,int c){
        return Math.min(a, Math.min(b, c));
    }
    static int Maximum(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }

}
