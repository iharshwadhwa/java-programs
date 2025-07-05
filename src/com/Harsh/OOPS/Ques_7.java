package com.Harsh.OOPS;
import java.util.*;
public class Ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        students[0]= new Student("Harsh",101);
        students[1]= new Student("Riya",102);
        students[2]= new Student("Aryan",103);
        for(int i =0;i<3;i++){
            students[i].printdetails();
            System.out.println("--------");
        }

    }
   static class Student{
        String name;
        int rollno;

        Student(String name,int rollno){
            this.name = name;
            this.rollno=rollno;
        }

        void printdetails(){
            System.out.println("name: "+name);
            System.out.println("rollno: "+rollno);
        }

    }
}
