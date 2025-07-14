package com.Harsh.OOPS.Garbage_collection;

public class Car_finalize {
    public static void main(String[] args) {
        Car_finalize c1= new Car_finalize();
        Car_finalize c2 =c1;
        c1=null;
        System.gc();
    }
    public void finalize(){
        System.out.println("Car object is deleted");
    }
}


