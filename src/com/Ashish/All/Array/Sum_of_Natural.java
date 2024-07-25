package com.Ashish.All.Array;

import java.util.Scanner;

public class Sum_of_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural number is :"+natural(n));
    }
    static int natural(int num){
        int sum = 0;
        for (int i=1;i<=num;i++){
            sum = sum+i;
        }
        return  sum;
    }
}
