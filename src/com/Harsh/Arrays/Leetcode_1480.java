//1480. Running Sum of 1d Array

//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]

package com.Harsh.Arrays;
import java.util.*;
public class Leetcode_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr= new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(RunningSum(arr)));
    }
    static int[] RunningSum(int[] nums){
        for(int i =1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
