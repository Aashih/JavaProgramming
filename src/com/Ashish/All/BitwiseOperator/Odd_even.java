package com.Ashish.All.BitwiseOperator;

public class Odd_even {
    public static void main(String[] args) {
        long n = 9;
        System.out.println(odev(n));
    }
    static boolean odev(long n){
        return ((n & 1) == 1) ;
    }
}
