package com.Harsh.OOPS.Constructors;

public class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo= rollNo;
    }

    public static void main(String[] args) {
        Student s1= new Student("Zainab", 1234);
        Student s2= new Student("Harsh", 5678);

        System.out.println(s1.name +" "+s1.rollNo);
        System.out.println(s2.name +" "+s2.rollNo);
    }
}
