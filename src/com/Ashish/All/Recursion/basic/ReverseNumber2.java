package com.Ashish.All.Recursion.basic;

public class ReverseNumber2 {
    static int reverse(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    static int helper(int n , int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        int n = 7643;
        System.out.println(reverse(n));
    }
}
