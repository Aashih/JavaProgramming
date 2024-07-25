package com.Ashish.All.String;

import java.util.Arrays;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Hello How Are You";
        System.out.println(str);
        System.out.println("After removing the space / white space");
        System.out.println(str.replaceAll("\\s",""));


        //Split the string
        System.out.println("String after split");
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
