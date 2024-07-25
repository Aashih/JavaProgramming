package com.Ashish.All.Basic;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,n1=0 ;
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            
        } while (n!=0);
        System.out.println();
    }
}
