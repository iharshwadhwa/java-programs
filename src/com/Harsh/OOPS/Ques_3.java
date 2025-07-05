package com.Harsh.OOPS;
import java.sql.SQLOutput;
import java.util.*;
public class Ques_3 {
    public static void main(String[] args) {

        Person p1= new Person("Harsh");

        p1=null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("End of main");

    }
    static class Person{
        String name;

        Person(String name){
            this.name=name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("Finalize called for "+name);
        }
    }
}
