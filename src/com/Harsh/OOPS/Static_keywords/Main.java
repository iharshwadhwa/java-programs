package com.Harsh.OOPS.Static_keywords;

public class Main {
    public static void main(String[] args) {
        Human Harsh= new Human(20,"Harsh Wadhwa",10000,false);
        Human Kunal= new Human(24,"Kunal kushwaha",100000,true);


        //System.out.println(Harsh.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //greeting();
    }
    //we know tht something is non-static, belongs to the object

    //not dependent on object
    static void fun(){
        //greeting(); //we cant use bcz it requires an instance but we r using static

        //you cannot access a non-static stuff without referencing theri instances in a static context

        //hence here it is referring
        Main obj = new Main();
        obj.greeting();
    }


    //dependent on object
    void greeting(){
        fun();
        System.out.println("Hello world");
    }
}
