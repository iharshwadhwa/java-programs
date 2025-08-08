package com.Harsh.BinarySearch;

public class Leetcode852 {
    public static void main(String[] args) {
        int [] arr={0,10,5,2};
//        System.out.println(linearsearch(arr));
        System.out.println(binarysearch(arr));
    }

//    static int linearsearch(int [] arr){
//        if(arr.length==0){
//            return -1;
//        }
//        int max=Integer.MIN_VALUE;
//        int index=-1;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                index=i;
//            }
//        }
//        return index;
//    }
    static int binarysearch(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
