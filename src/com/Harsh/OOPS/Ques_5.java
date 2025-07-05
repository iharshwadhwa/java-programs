package com.Harsh.OOPS;
import java.util.*;
public class Ques_5 {
    public static void main(String[] args) {
        GarbageTest g1= new GarbageTest();

        g1=null;

        GarbageTest g2= new GarbageTest();
        g2= null;

        System.gc();
    }
   static class GarbageTest{

        String name;

        GarbageTest(){
            this.name = "Harsh";
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is garbage collected");
        }
    }
}
