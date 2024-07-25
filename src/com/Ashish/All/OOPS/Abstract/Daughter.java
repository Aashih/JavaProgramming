package com.Ashish.All.OOPS.Abstract;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become Cricketer");
    }

    @Override
    void patner() {
        System.out.println("I love batting");
    }
}
