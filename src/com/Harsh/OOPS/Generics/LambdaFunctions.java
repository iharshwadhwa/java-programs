package com.Harsh.OOPS.Generics;

interface MessagePrinter{
    void printMessage();
}

public class LambdaFunctions {
    //    public static void main(String[] args){
//        MessagePrinter mp = new MessagePrinter() {
//            @Override
//            public void printMessage() {
//                System.out.println("Hello ! without using lambda function");
//            }
//        };
//        mp.printMessage();
    public static void main(String[] args) {
        MessagePrinter mp =()-> System.out.println("Hello from lambda expressions");
        mp.printMessage();
    }

}
