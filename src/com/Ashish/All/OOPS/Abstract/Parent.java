package com.Ashish.All.OOPS.Abstract;

public abstract class Parent {
    abstract void career();
    abstract void patner();
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void helo(){ //static method can be used in abstract class but cannot create abstract static method
        System.out.println("Heyy ");
    }

    void normal(){
        System.out.println("How are you ");
    }


}
