package com.Harsh.OOPS.Static_keywords;

public class student {

    public static int count=0;

    public student(){
        count++;
    }

    private int id;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void getcount(){
        System.out.println("Total students: "+count);
    }
}
