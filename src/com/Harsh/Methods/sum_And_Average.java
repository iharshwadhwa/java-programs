package com.Harsh.Methods;
import java.util.*;
public class sum_And_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr));

    }
    static int sum(int [] arr){
        int sum =arr[0];
        for(int i =1;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
