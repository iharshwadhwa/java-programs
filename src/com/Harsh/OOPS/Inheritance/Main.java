package com.Harsh.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        Box box1= new Box(box);
       //System.out.println(box.w+" "+box.h);

       Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.w);

        // BoxWeight box6= new Box(2,3,4 );

//        BoxWeight box3= new BoxWeight();
//        BoxWeight box4= new BoxWeight(2,3,4,5);
//        System.out.println(box3.h+" "+box3.w+" "+box3.l+" "+box3.weight);
    }
}
