package com.Harsh.CollectionFrameworks;

//import java.util.ArrayList;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(11);
//        list.add(1);
//        list.add(5);
//        list.add(80);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for(int i =0;i<list.size();i++){
//            System.out.println(list.get(i));
        //     }
//
//        System.out.println(list.contains(50));
//        System.out.println(list.contains(5));
//        list.remove(2);
//        list.add(2,50);
//        list.set(2,50);
//        System.out.println(list);
//        for(int x : list){
//            System.out.println(x);
//       }
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        System.out.println(list.size());
//        list.trimToSize();
//        System.out.println();

//        ArrayList<String> list = new ArrayList<>();
//        List<String> list = new ArrayList<>();
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list1.getClass().getName());

        List<String> list2 = new ArrayList<>(list1);
        list2.add("Wednesday");
        System.out.println(list2);

        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
      //  list.add(0, 5);
//        list.addFirst(3);

        List<Integer> List5 = List.of(4, 5, 6, 7, 8, 9);
        list.addAll(List5);
        System.out.println(list);

//        List5.addAll(list);

//        List<Integer> list3 = List.of(1, 2, 3);
    }
}
