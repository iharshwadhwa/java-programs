package com.Harsh.OOPS.Final;

public class Camera {

    Camera(){
        System.out.println("Basic Camera");
    }
    Camera(String model){
        System.out.println("Model name is: "+model);
    }

    public static void main(String[] args) {
        Camera c1= new Camera();
        Camera c2= new Camera("Sony");
    }
}
