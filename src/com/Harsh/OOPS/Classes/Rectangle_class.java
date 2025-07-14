package com.Harsh.OOPS.Classes;
import java.util.*;
public class Rectangle_class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();

        Rectangle r1= new Rectangle(h,w);
        r1.displayArea();
    }
}

class Rectangle{
//    int width;
//    int height;
//
//    void getArea(){
//        Scanner sc= new Scanner(System.in);
//        width=sc.nextInt();
//        height=sc.nextInt();
//    }
//    void displayArea(){
//        int result= width*height;
//        System.out.println("The area of rectangle is: "+ result);
//    }

    int width;
    int height;

    Rectangle(int width,int height){
        this.height=height;
        this.width=width;
    }
    int getArea(){
        return height*width;
    }
    void displayArea(){
        System.out.println("The area of rectangle is: "+getArea());
    }

}
