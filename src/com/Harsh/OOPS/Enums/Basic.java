package com.Harsh.OOPS.Enums;

public class Basic {
    enum Week{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        //these are enums constants
        //public static and final
        //since its final u can't create child enums
        //type is week

        Week(){
            System.out.println("COnstructor called for: "+this);
        }
        //this is not public or protected only private or default
    }

    public static void main(String[] args) {
        Week week;
        week =Week.monday;
//        for(Week day: Week.values()){
//            //System.out.println(day);
//            System.out.println(week.ordinal());
//        }
    }
}
