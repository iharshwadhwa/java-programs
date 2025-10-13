package com.Harsh.OOPS.Acces;

public class A {
    protected int num;
    public String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(String name, int num) {
        this.arr = new int[num];
        this.name = name;
        this.num = num;
    }
}
