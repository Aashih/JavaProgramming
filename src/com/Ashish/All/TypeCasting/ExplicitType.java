package com.Ashish.All.TypeCasting;

public class ExplicitType {
    public static void main(String[] args) {
        byte a =50;
//        a = (a*2); this will give an error
        a = (byte)(a*4);
        System.out.println(a);
    }
}
