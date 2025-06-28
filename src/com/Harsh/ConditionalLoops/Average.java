package com.Harsh.ConditionalLoops;
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i =1;i<=n;i++){
            int p=sc.nextInt();
            sum+=p;
        }
        System.out.println(sum);


    }
}
