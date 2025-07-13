package com.Harsh.OOPS.Access;

public class A {
   private int num;
    public String name;
   protected int [] arr;
   public int getnum(){
       return num;
   }
   public void setnum(){
       this.num = num;
   }

    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[10];
    }
}
