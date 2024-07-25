package com.Ashish.All.OOPS.EnumsExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednusday,Thursday,Friday,Saturday

        //these are enum constant
        //it can be public,static,final
        //since it is final we cannot create child enum
        //it is of type week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednusday;
        System.out.println(week);
        System.out.println(Week.valueOf("Tuesday"));
        System.out.println(week.ordinal()); // ordinal return the position of enum constant
        System.out.println();

        for (Week days:Week.values()){
            System.out.println(days);
        }
    }
}
