package com.Ashish.All.OOPS.Abstract;

public class Son extends Parent{

    Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to become footballer ");
    }

    @Override
    void patner() {
        System.out.println("I love keeping ");
    }
}
