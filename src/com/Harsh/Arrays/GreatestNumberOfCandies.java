package com.Harsh.Arrays;
import java.util.*;
public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies= {2,3,5,1,3};
        int n =3;
        System.out.print(kidsWithCandies(candies,n));
    }
    static List<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        List<Boolean> result = new ArrayList<>();

        int maxCandies=0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>maxCandies){
                maxCandies=candies[i];
            }
        }
        for(int i =0;i<candies.length;i++){
            result.add(candies[i]+extraCandies>=maxCandies);
        }
        return result;
    }


}
