package com.Ashish.All.Basic;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0;i<num;i++){
            System.out.print(first+"\t");
            int next = first + second ;
            first = second ;
            second = next ;
        }
        System.out.println();
        System.out.println(first);
    }
}
