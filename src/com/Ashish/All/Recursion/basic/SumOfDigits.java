package com.Ashish.All.Recursion.basic;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1324;
        System.out.println(n%10);
        System.out.println(1/10);
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if (n==0){
            return 0;
        }
        int rem = n%10;
        return rem + sum(n/10);
    }
}
