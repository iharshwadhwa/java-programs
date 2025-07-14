package com.Harsh.OOPS.Constructors;
import java.util.*;
public class Box_constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w= sc.nextInt();
        int h= sc.nextInt();
        int d=sc.nextInt();

        Box b1= new Box(w);
        Box b2 = new Box(w, h);
        Box b3= new Box(w,h,d);
        sc.close();
    }
}
class Box{
    int width;
    int height;
    int depth;

    Box(int width){
        this.width=width;
        displaywidth();
    }
    void displaywidth(){
        System.out.println("The width of the box is: "+width);
    }
    Box(int width, int height){
        this.width=width;
        this.height=height;
        displayboth();
    }
    void displayboth(){
        System.out.println("the width of the box is: "+ width+" & the height of the box is: "+ height);
    }
    Box(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
        displayAll();
    }
    void displayAll(){
        System.out.println("the height of the box is: "+ height);
        System.out.println("the width of the box is: "+ width);
        System.out.println("the depth of the box is: "+ depth);
    }

}
