package com.Harsh.Methods;
import java.util.*;
public class Unique_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            boolean isunique = true;

            for(int j =0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    isunique = false;
                    break;
                }
            }

            if(isunique){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
