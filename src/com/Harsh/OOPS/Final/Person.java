package com.Harsh.OOPS.Final;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Person p1= new Person("Harsh",21);
        Person p2= new Person("Akshit",21);
        System.out.println( "Name: "+p1.name+","+ "Age: "+p1.age);
        System.out.println("Name: "+p2.name+","+"Age: "+p2.age);
    }

}
