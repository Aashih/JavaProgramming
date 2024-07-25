package com.Ashish.All.Basic;

import java.util.Scanner;

public class Amstrng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int orginal , rem , ans = 0;
//        int digit=0;
//        System.out.println("Enter number: ");
//        int num = input.nextInt();
//        orginal = num;
//        while(orginal!=0){
//            orginal/=10;
//            ++digit;
//        }
//        orginal = num;
//        while (orginal!=0) {
//            rem = orginal % 10;
//            ans += com.Ashish.All.Math.pow(rem, digit);
//            orginal /= 10;
//        }
//        if (ans==num){
//            System.out.println("Armstrong number !");
//        }
//        else {
//            System.out.println("Not a Armstrong number");
//        }
//    }
        System.out.println("Enter a number ");
        int n = input.nextInt();
        amg(n);
    }
        static void amg (int num){
            int ans = 0, digit = 0, rem, original;
            original = num;
            while (original != 0) {
                original /= 10;
                digit++;
            }
            original = num;
            while (original != 0) {
                rem = original % 10;
                ans += Math.pow(rem, digit);
                original /= 10;
            }
            if (ans == num) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

    }