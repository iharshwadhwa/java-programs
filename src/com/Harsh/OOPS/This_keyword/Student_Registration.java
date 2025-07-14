package com.Harsh.OOPS.This_keyword;

public class Student_Registration {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student("Riya",345,"B.com");
    }
}
class Student{
    String name;
    int rollNo;
    String branch;

    Student(){
        this("Harsh",382,"CSE");
    }
    Student(String name,int rollNo,String Branch){
        this.name=name;
        this.rollNo=rollNo;
        this.branch=Branch;
        display(this);
    }
    void display(Student s){
        System.out.println("Students registered: "+name+" "+rollNo+" "+branch);
    }

}
