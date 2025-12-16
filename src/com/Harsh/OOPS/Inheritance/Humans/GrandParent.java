package com.Harsh.OOPS.Inheritance.Humans;

public class GrandParent {
    private String name;
    private int age;
    private boolean hasSuperPowers;

    public boolean hasSuperPowers(){
        return hasSuperPowers;
    }
    public GrandParent(int age,String name){
        this.age=age;
        this.name=name;
        hasSuperPowers=true;
        System.out.println("GrandParent Constructor called");
    }

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
}
