package com.Harsh.OOPS;

import javax.swing.*;

public class Box_inheritance {
    double l;
    double h;
    double w;

    Box_inheritance(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //cube
    Box_inheritance(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box_inheritance(double l ,double h,double w){
        this.l =l;
        this.h=h;
        this.w=w;
    }
    Box_inheritance(Box_inheritance old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}
