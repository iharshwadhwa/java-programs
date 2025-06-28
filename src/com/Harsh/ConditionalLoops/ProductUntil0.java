package com.Harsh.ConditionalLoops;
import java.util.*;
public class ProductUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        while (true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);
    }
}
