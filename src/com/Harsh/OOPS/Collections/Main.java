package com.Harsh.OOPS.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        List<Integer> list2= new LinkedList<>();

        List<Integer> list3= new Vector<>();
        list3.add(45);
        list3.add(5);
        list3.add(14);
        System.out.println(list3);

        list2.add(34);
        list2.add(78);
        list2.add(89);
        list2.add(98);
        System.out.println(list2);
    }
}
