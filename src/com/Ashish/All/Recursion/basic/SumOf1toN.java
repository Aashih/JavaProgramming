package com.Ashish.All.Recursion.basic;

public class SumOf1toN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
