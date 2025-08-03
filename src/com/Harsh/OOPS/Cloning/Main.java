package com.Harsh.OOPS.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Harsh = new Human(20,"Harsh Wadhwa");
     //   Human twin = new  Human(Harsh);
        Human twin = (Human)Harsh.clone();
        System.out.println(twin.age+" "+twin.name);

    }
}
