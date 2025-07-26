package com.Harsh.OOPS.Interfaces;

public class Bird implements Flyable{
    String species;

    Bird(String Species){
        this.species=species;
    }
    @Override
    public void takeoff(){
        System.out.println(species+" can fly with wings");
    }
    @Override
    public void land(){
        System.out.println(species+" lands on a branch");
    }
    @Override
    public void glide(){
        System.out.println(species+" Glides gracefully");
    }
}
