package com.Harsh.OOPS.Generics;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        Test2 test = new Test2();
        Integer[] intArray={1,2,3,4,5};
        String[] stringArray={"Hello World!"};
        test.printArray(stringArray);
        test.printArray(intArray);
    }


public <T> void printArray(T[] array){
    for(T element:array){
        System.out.print(element + " ");
    }
    System.out.println();
}
    }
