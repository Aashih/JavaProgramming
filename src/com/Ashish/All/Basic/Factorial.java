package com.Ashish.All.Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n1 = sc.nextInt();
        if (n1 == 0 || n1 ==1){
            System.out.println("Factorial of "+n1+"! is: 1");
        }
        else {
            System.out.println("Factorial of "+n1+"!"+" is: "+fact(n1));
        }
    }
    static int fact(int num){
        int ans = 1;
        for (int i = 1 ; i<=num ; i++){
            ans*=i;
        }
        return ans;
    }
}
