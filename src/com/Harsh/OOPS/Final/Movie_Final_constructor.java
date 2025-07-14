package com.Harsh.OOPS.Final;
import java.util.*;
public class Movie_Final_constructor {
    public static void main(String[] args) {
        Movie m1= new Movie();
    }
}
class Movie{
    final String name;
    final int release;

    Movie(){
        name="Your fault";
        release= 2026;
        display();
    }
    void display(){
        System.out.println("Movie name is: "+name+ " & release year is: "+release);
    }
}
