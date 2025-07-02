package com.Harsh.Methods;
import java.util.*;
public class max_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr [] = new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println(max(arr));

    }
    static int max(int [] arr){
        int maximum= arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
