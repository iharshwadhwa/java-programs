package com.Harsh.Arrays;
import java.util.*;
public class Array_From_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans = buildarray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] buildarray(int[] arr){
        int n =arr.length;
        int []ans = new int[n];
        for(int i =0;i<arr.length;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
