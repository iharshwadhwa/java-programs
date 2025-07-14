package com.Harsh.OOPS.Classes;
import java.util.*;
public class Student_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setter();
        s2.setter();
        s3.setter();
        s1.getter();
        s2.getter();
        s3.getter();
    }
}
    class Student{
        String name;
        int rollNo;

        void setter(){
            Scanner sc= new Scanner(System.in);
            name= sc.nextLine();
            rollNo=sc.nextInt();
        }
        void getter(){
            System.out.println("Name is: "+name);
            System.out.println("Roll no. is: "+rollNo);
        }

    }

