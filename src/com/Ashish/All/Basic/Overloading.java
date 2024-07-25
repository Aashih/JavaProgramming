package com.Ashish.All.Basic;

public class Overloading {
    public static void main(String[] args) {
        fun(55);
        System.out.println("Hello "+fun("Ashish"));
    }
    static void fun(int num){
        System.out.println("Number: "+num);
    }
    static String fun(String name){
        return name;
    }
}
