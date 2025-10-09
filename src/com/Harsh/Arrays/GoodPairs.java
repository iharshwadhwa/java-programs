package com.Harsh.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println(goodpair(nums));
    }
    static int goodpair(int [] arr){
        int result =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    result++;
                }
            }
        }
        return result;
    }
}
