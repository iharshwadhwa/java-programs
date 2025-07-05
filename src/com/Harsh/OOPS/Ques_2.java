package com.Harsh.OOPS;
import java.util.*;
public class Ques_2 {
   static class Car{
       private int model;
       private int year;

        Car(int m,int y){
            this.model =m;
            this.year = y;
        }

        public void printInfo(){
            System.out.println("Model: "+model);
            System.out.println("Year: "+year);
        }
    }

    public static void main(String[] args) {
        Car mycar= new Car(2023,1234);
        mycar.printInfo();
    }


}
