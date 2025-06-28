package com.Harsh;
import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Good morning, "+name);
        sc.close();
    }
}
