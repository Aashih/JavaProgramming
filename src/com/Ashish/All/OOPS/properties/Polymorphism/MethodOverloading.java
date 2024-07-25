package com.Ashish.All.OOPS.properties.Polymorphism;

public class MethodOverloading {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading N1 = new MethodOverloading();

        System.out.println(N1.sum(4,5));

        System.out.println(N1.sum(5,6,7));

    }
}
