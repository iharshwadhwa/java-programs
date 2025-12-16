package com.Harsh.OOPS.Inheritance.Animals;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Cats cat= new Cats();
//         dog.setAge(2);
//         dog.setName("Bob");
//         dog.eat();
         dog.sayHello();
         Animal animal= new Animal();
         animal.sayHello();
         cat.sayHello();
    }
}
