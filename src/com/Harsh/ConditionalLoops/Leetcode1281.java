package com.Harsh.ConditionalLoops;
import java.util.*;
public class Leetcode1281 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m =sc.nextInt();
        System.out.println(Result(m));
    }
    static int Result(int n){
        int product =1;
        int sum=0;
        while(n>0){
            int digit =n%10;
            product*=digit;
            sum+=digit;
            n/=10;
        }
       return product-sum;
    }
}
