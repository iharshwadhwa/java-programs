package com.Harsh.Basics;
import java.util.*;
public class LargestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        int max = a;
        if(b>max){
            max=b;
        }
        System.out.println(max);
    }
}
