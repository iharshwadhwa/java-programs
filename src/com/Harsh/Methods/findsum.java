package com.Harsh.Methods;
import java.util.*;
public class findsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(Nsum(m));
    }
    static int Nsum(int n){
        int sum=0;
        for(int i =0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
