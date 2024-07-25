package com.Ashish.All.Recursion.basic;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 3421;
        System.out.println(pro(n));
    }
    static int pro(int n){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * pro(n/10);
    }
}
