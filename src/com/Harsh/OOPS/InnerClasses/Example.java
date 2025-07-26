package com.Harsh.OOPS.InnerClasses;

public class Example {
   static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test t1= new Test("Harsh");
        Test t2= new Test("Kunal");
    }
}
