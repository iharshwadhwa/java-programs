package com.Harsh.BinarySearch;

public class leetcode1095 {
    public static void main(String[] args) {

    }

    int search(int[] arr,int target){
        int peak=searchinMountain(arr);
        int firsttry=binarysearch(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        //try to search in second half
        return binarysearch(arr,target,peak+1,arr.length-1);
    }

    static int binarysearch(int [] arr,int target,int start,int end){
        start = 0;
        end =arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==mid){
                mid=target;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public int searchinMountain(int [] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
