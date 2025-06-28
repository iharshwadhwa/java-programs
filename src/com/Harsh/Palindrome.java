package com.Harsh;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+","").toLowerCase();

        String reversed = "";

        for(int i = cleaned.length()-1;i>=0;i--){
            reversed +=cleaned.charAt(i);
        }
        if(reversed.equals(cleaned)){
            System.out.println("The string is palindrome");
        }
    }
}
