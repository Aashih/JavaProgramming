package com.Ashish.All.OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(10);
        System.out.println(son.age);
        son.career();
        son.patner();

        System.out.println();

        Daughter dtr = new Daughter(10);
        System.out.println(dtr.age);
        dtr.career();
        dtr.patner();

        Parent.helo();
        son.normal();
    }
}
