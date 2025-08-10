package com.Harsh.BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] arr,int target){
        int pivot=findPivot(arr);

        //if u didnot find a pivot it means the array is not rotated
        if(pivot==-1){
            //just do the binary search
            return binarysearch(arr,target,0,arr.length-1);
        }
        //if pivot is found you have 2 sorted arrays
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarysearch(arr,target,0,pivot-1);
        }
        return binarysearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarysearch(int [] arr ,int target,int start,int end){
         start =0;
         end=arr.length-1;

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
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //4 cases over here
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1] ){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=start){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
