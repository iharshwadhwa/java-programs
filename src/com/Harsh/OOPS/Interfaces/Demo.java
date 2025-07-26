package com.Harsh.OOPS.Interfaces;

public class Demo {
    public static void main(String[] args) {
        Flyable.describeFLight();
        Bird eagle = new Bird("Eagle");
        eagle.takeoff();
        eagle.land();
        eagle.glide();
        System.out.println("Flying altitude for flight: "+Flyable.MAX_ALTITUDE);
        System.out.println("-----");

        Airplane boeing = new Airplane("Boeing 747");
        boeing.takeoff();
        boeing.glide();
        boeing.land();
    }
}
