package com.Ashish.All.BitwiseOperator;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 4;
        if ((n & n-1) ==0 && n!=0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
