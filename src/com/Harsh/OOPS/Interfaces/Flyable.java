package com.Harsh.OOPS.Interfaces;

public interface Flyable {
    int MAX_ALTITUDE= 10000;

    void takeoff();
    void land();

    default void glide(){
        System.out.println("Gliding through the air");
    }
    static void describeFLight(){
        System.out.println("This interface defines objects that can fly");
    }
}


