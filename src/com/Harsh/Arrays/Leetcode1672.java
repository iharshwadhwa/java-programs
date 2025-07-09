// LEETCODE 1672
//       The richest customer is the customer that has the maximum wealth.
//        Example 1:
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.
//        Example 2:
//        Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.
//        Example 3:
//        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//        Output: 17

package com.Harsh.Arrays;
import java.util.*;
public class Leetcode1672 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maximum(arr));

    }
    static int maximum(int[][] accounts){
            int ans = Integer.MIN_VALUE;

            for(int i =0;i< accounts.length;i++){
                int sum=0;
                for(int j =0;j<accounts[i].length;j++){
                    sum+=accounts[i][j];
                }
                if(sum>ans){
                    ans=sum;
                }
            }
            return ans;
    }
}
