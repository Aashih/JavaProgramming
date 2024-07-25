package com.Ashish.All.Array;

import java.util.Scanner;

public class Largest_Smallest_ofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number b: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number c: ");
        int num3 = sc.nextInt();
        System.out.println("Largest of "+num1+","+num2+","+num3+" is: ");
        largest(num1,num2,num3);
        System.out.println("Smallest of "+num1+","+num2+","+num3+"is: ");
        smallest(num1,num2,num3);
    }

    static void largest(int n1 , int n2 , int n3){
        if (n1>n2 && n1>n3){
            System.out.println(n1+" is Largest among these number ");
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2+" is Largest among these number ");
        } else if (n3>n1 && n3>n2) {
            System.out.println(n3+" is Largest among these number ");
        }
        else {
            System.out.println("invalid input");
        }
    }
    static void smallest(int n1 , int n2 , int n3){
        if (n1<n2 && n1<n3){
            System.out.println(n1+" is smallest among these number ");
        } else if (n2<n1 && n2<n3) {
            System.out.println(n2+" is smallest among these number ");
        }
        else {
            System.out.println(n3+" is smallest among these number");
        }
    }
}
