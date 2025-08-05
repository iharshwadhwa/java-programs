package com.Harsh.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr= {-18,12,-4,0,2,3,4,15,18,22,45};
        int target=22;
        System.out.println(binarysearch(arr,target));
    }

    //return the index
    //return -1 if it doesn't exist
    static int binarysearch(int [] arr ,int target){
        int start =0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
