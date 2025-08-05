package com.Harsh.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target =23;
        int ans = ceiling(arr,target);
        System.out.println("Ceiling of " + target + " is at index: " + ans + " (value: " + (ans != -1 ? arr[ans] : "None") + ")");
    }
    static int ceiling(int [] arr ,int target){
        if(arr.length==0){
            return -1;
        }
        if(target>arr.length){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

}
