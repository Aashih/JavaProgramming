package com.Ashish.All.Array;

import java.util.Scanner;

public class Largest_Until_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int num;
        do {
            System.out.println("Enter number(0 to stop) :");
            num = sc.nextInt();
            if (num!=0 && num<smallest){
                smallest = num;
            }
        }while (num!=0);
        if (smallest != Integer.MAX_VALUE){
            System.out.println("Largest value among this number is: "+smallest);
        }
        else {
            System.out.println("Invalid input !");
        }
    }
}
