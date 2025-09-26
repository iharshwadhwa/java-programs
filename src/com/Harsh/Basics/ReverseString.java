package com.Harsh.Basics;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reversed="";

        for(int i = input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }
        System.out.println(reversed);
    }
}
