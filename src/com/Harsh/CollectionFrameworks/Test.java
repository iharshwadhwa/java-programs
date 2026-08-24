package com.Harsh.CollectionFrameworks;

import java.util.*;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2){
        return 0;
    }
}

public class Comparator {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

//        Collections.sort(list);
//        list.sort(null);
//        System.out.println(list);
        List<String> list1 = Arrays.asList("Apple", "Orange", "Banana","Dates");
        list1.sort(new StringLengthComparator());  //Ascending order sort

        System.out.println(list1);

    }
}
