package com.Ashish.All.OOPS.AccessModifier;

public class A {
//    private int num ;
    protected int num ;
    String name;
    int[] arr ;

    //We can access the private members using getter and setter

//
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
