package com.Harsh.OOPS.Inheritance.Humans;

public class Child extends Parent {

    public Child(int age,String name){
        super(age,name);
        System.out.println("Child Constructor Called");
    }
    public void ChildMethod(){
        super.parentMethod();
        System.out.println("Parent Method Called");

    }

}
