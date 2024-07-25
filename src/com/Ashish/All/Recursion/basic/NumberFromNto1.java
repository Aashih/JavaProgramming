package com.Ashish.All.Recursion.basic;

public class NumberFromNto1 {
    public static void main(String[] args) {
        int n =5;
        num(n);
    }
    static void num(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        num(n-1);

    }
}
