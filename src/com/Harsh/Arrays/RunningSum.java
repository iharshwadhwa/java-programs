package com.Harsh.Arrays;
import java.util.*;
public class RunningSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningsum(nums)));
    }
    static int [] runningsum(int [] arr){
        int n =arr.length;
        int []sum = new int[n];
        sum[0]= arr[0];
        for(int i =1;i<arr.length;i++){
            sum[i] = sum[i-1]+arr[i];
        }
        return sum;
    }
}
