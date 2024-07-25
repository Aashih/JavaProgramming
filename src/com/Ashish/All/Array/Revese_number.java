package com.Ashish.All.Array;

public class Revese_number {
    public static void main(String[] args) {
        int num = 23597 , rem;
        int reverse=0;
        while (num!=0){
            rem = num%10;
            reverse =reverse*10 + rem;
            num/=10;
        }
        System.out.println("Reverse order is :"+reverse);
    }
}
