package com.Ashish.All.Array;

public class Occurence_digit {
    public static void main(String[] args) {
        int num = 1385757879;
        int occur = 1;
        int count = 0;
        int rem ;
        while(num!=0){
            rem = num%10;
            if(rem == occur){
                    count++;
                }
            num/=10;
            }
        System.out.println(count);
        }
    }
