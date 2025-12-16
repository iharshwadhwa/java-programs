package com.Harsh.OOPS.Classes;

public class Movie {

    void play() {
        System.out.println("Movie name is: Fifty Shades of grey");
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();
        m1.play();
        m2.play();
        m3.play();
    }
}
