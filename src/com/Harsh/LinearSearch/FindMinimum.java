package com.Harsh.LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int [] arr= {12,3,98,78,1,35};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i =1;i<arr.length;i++){
            int element =arr[i];
            if(element<min){
                min=element;
            }
        }
        return min;
    }
}
