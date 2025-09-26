package com.Harsh.Basics;
import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        String original = input;
        String Reversed= "";

        for(int i = input.length()-1;i>0;i--){
            Reversed+=input.charAt(i);
        }
        if(original.equals(Reversed)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}
