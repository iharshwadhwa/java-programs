package com.Harsh.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int nums[]={1,22,45,9,86,89,43};
        int target=3 ;
        System.out.println(linearSearch2(nums,target));
    }

    //search the target and return the element itself

    static int linearSearch2(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            //check for element at every index if it is equal to target
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    //search the target and return true or false

    static boolean linearSearch3(int [] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int element : arr) {
            //check for element at every index if it is equal to target
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    //search in the array :: return the index if item found otherwise return -1

    static int linearSearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            //check for element at every index if it is equal to target
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
