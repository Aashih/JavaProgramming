package com.Ashish.All.BitwiseOperator;

public class Prac {
    public static void main(String[] args) {
        String str = "anagram";
        String str1 = "nagaram";
        int count = 0;
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            for(int j = i ; j<ch1.length ; j++)
            if (ch1[i] == ch2[j]) {
                count++;
            }
        }
        if (count == ch1.length){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
