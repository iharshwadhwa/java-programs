package com.Harsh.OOPS.Interfaces;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
        dog.run();
//        cat.run();
        Animal.info();
    }
}
