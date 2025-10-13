package com.Harsh.OOPS.Generics;

public class Comparing {
   static class Student implements Comparable{
        int rollno;
        float marks;

       public Student(int rollno,float marks) {
           this.rollno=rollno;
           this.marks = marks;
       }

       @Override
       public int compareTo(Object o) {
           return 0;
       }
   }
}
