package com.Harsh.OOPS.Enums;

enum Season{
    Winter,Spring,Summer,Autumn
}

public class Usage_Enums {
    public static void main(String[] args) {
        Season s= Season.Spring;
        switch(s){
            case Winter:
                System.out.println("it's cold");
            break;
            case Spring:
                System.out.println("It's Spring");
                break;
            default:
                System.out.println("Season is normal");
        }
    }
}
