package com.Ashish.All.String;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Ashish";
        char element = 'i';
        System.out.println(search(name,element));
    }
    static int search(String naam , char chr){
        int len = naam.length();
        for (int i = 0 ; i<len ; i++){
            if (naam.charAt(i) == chr){
               return i;
            }
        }
        return -1;
    }
}
