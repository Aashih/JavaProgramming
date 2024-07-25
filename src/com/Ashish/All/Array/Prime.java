package com.Ashish.All.Array;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        prime(n);
    }
    static void prime(int num){
        int count = 0;
       if (num<=1){
           System.out.println("Enter valid number ");
        }
       else {
           for (int i = 2 ; i<=num ; i++){
               if (num%i==0){
                   count++;
               }
           }
       }
       if (count == 1){
           System.out.println(num + " is prime ");
       }
       else {
           System.out.println(num + " is not prime");
       }
    }
}
