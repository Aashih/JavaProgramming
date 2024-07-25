package com.Ashish.All.Recursion.basic;

public class Palindrom {
    public static void main(String[] args) {
        int n = 65456;
        System.out.println(ans(n));
    }
    static int palin2(int n){
        int digit = (int)(Math.log10(n))+1;
        return palin(n,digit);
    }
    static int palin(int n,int digit){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) + palin(n/10,digit-1);
    }
    static boolean ans(int n){
        return n == palin2(n);
    }
}
