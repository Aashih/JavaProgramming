package com.Ashish.All.Recursion.basic;

public class CountZero {
    public static void main(String[] args) {
        int n = 300402000;
        zero(n);
        System.out.println(count);
    }
    static int count = 0 ;
    static void zero(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        if (rem ==0){
            count++;
        }
        zero(n/10);

    }
}
