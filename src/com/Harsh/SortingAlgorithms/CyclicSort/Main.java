package com.Harsh.SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {13,11,14,12,15};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swapIndex(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swapIndex(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
