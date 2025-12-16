package com.Harsh.OOPS.Abstract;

public abstract class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayhello(); //abstract methods

    public void sleep(){
        System.out.println("zzz...."); //concrete methods
    }
}
