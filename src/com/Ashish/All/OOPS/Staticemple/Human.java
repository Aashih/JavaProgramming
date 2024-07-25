package com.Ashish.All.OOPS.Staticemple;

public class Human {
    int age;
    String name;
    String Place;
    int Slry;

    static long population ; // such properties which is not
    //related to the object but are common to all the object of that class

    public Human(int age, String name, String place, int slry) {
        this.age = age;
        this.name = name;
        Place = place;
        Slry = slry;
        Human.population+=1;
    }
}
