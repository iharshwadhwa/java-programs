package com.Harsh.Arrays;
import java.util.*;
public class Leetcode1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();
        int[] arr= new int [2*n];
        for(int i =0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println((Arrays.toString(shuffle(arr, n))));
    }
    static int[] shuffle(int[] nums,int n){
        int result[] = new int[2*n];

        for(int i =0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];
        }
        return result;
    }
}
