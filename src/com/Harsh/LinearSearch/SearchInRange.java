package com.Harsh.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int nums[]={12,54,89,47,79,61,99};
        int target= 61;
        System.out.println(search(nums,target,0,4));
    }

    //if we want to return true or false instead of the element
    static boolean search(int [] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for(int i =start;i<=end;i++){
            int element=arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }

    //if we want to return the index of the found element

    static int search2(int [] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i =start;i<=end;i++){
            int element=arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
