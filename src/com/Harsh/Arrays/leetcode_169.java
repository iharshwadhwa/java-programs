package com.Harsh.Arrays;
import java.util.*;
import java.util.Arrays;

public class leetcode_169 {
        static int majorityElement(int[] nums) {
            int n=nums.length;
            for(int i =0;i<n;i++){
                int count=0;
                for(int j =0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>n/2){
                    return nums[i];
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            arr[i]=majorityElement(arr);
        }
    }
    }

