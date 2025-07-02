package com.Harsh.Methods;
import java.util.*;
public class Second_And_Third_largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        if(n<3){
            System.out.println("Enter more than 3 values");
        }
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int num=arr[i];
            if (num>first) {
                third=second;
                second = first;
                first=num;
            }
            else if(num>second && num!=first){
                third = second;
                second = num;
            }
            else if(num>third && num!=second && num !=first){
                third = num;
            }
        }
        System.out.println("First Maximum Integer "+first);
        System.out.println("Second Maximum Integer "+second);
        System.out.println("third Maximum Integer "+third);
    }



}
