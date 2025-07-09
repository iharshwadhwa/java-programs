package com.Harsh.OOPS;

public class Singleton {
   static  class singleton{
        private static singleton instance;
        private singleton(){
            System.out.println("Singleton object created");
        }
        public static singleton getInstance(){
            if(instance == null){
                instance = new singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {

    }

}
