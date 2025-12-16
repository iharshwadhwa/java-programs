package com.Harsh.OOPS.Inheritance.Humans;

public class Test {
    public static void main(String[] args) {
        Child child = new Child(10,"Ram");
        System.out.println(child.getAge());
        child.ChildMethod();
//        child.setAge(8);
//        Parent parent= new Parent();
//        parent.setAge(30);
//        parent.setName("Mukesh");
//        System.out.println(child.hasSuperPowers());
        //child.setAge(12);
    }
}
