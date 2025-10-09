package com.Harsh.Arrays;
import java.util.*;
public class Richest_Customer {
    public static void main(String[] args) {
        int[][]nums = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(Richest(nums));
    }
    static int Richest(int [][] arr){
        int n = arr.length;
        int ans =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int sum =0;
            for(int j =0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
