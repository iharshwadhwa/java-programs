package com.Harsh.Arrays;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n =3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int [] arr, int n){
        int [] result = new int[arr.length];
        int j=0;
        for(int i =0;i<n;i++){
           result [j++]=arr[i];
           result [j++]=arr[i+n];
        }
        return result;
    }
}
