package com.Harsh.OOPS;
import java.util.*;
public class Example_1 {
    static class Student{
        String name;
        static String College = "NIT";

        Student(String name){
            this.name=name;
        }

        void show(){
            System.out.println(name+"-"+College);
        }
    }

    public static void main(String[] args) {
        Student s1= new Student("Harsh");
        Student s2= new Student("Aryan");
        s1.show();
        s2.show();
    }
}
