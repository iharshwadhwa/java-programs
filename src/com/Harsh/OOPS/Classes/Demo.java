package com.Harsh.OOPS.Classes;
public class Demo {
   static class Student{
        String name;
        int rollNo;
        float marks;

        Student(String name,int rollNo,float marks){
            this.name=name;
            this.rollNo= rollNo;
            this.marks=marks;
            displayDetails();
        }
        void displayDetails(){
            System.out.println("Name; "+name+" rollNo: "+rollNo+" marks: "+marks);
        }
    }

    public static void main(String[] args) {
        Student Harsh = new Student("Harsh",382,99.8f);

    }
}
