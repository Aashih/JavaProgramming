package com.Ashish.All.BitwiseOperator;

public class NoOfDigit {
    public static void main(String[] args) {
        int num = 7;
        int base= 2;
        int ans = (int)(Math.log(num)/Math.log(base)) + 1;
        System.out.println(ans);
    }
}
