package com.Harsh.Arrays;
import java.util.*;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        int target = 20;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i+" "+ j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
        System.gc();
    }
}
