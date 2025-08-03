package com.Harsh.OOPS.Classes;

public class SwapDetails {
    static class Swap{
        String name;
        int rollNo;
        float marks;

        Swap(String name,int rollNo,float marks){
            this.name=name;
            this.rollNo=rollNo;
            this.marks=marks;
        }
        void displayDetails(){
            System.out.println("Name: "+name+" RollNo. "+rollNo+" marks: "+marks);
        }
    }
    static void swapData(Swap s1,Swap s2){
        String template= s1.name;
        s1.name=s2.name;
        s2.name=template;

        int temproll= s1.rollNo;
        s1.rollNo=s2.rollNo;
        s2.rollNo=temproll;

        float tempMarks = s1.marks;
        s1.marks=s2.marks;
        s2.marks= tempMarks;
    }

    public static void main(String[] args) {
        Swap s1= new Swap("Harsh",382,98.7f);
        Swap s2= new Swap("Zainab",322,99.6f);
        swapData(s1,s2);
        s1.displayDetails();
        s2.displayDetails();
    }
}
