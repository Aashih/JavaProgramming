package com.Ashish.All.String;

public class Palindrome {
    public static void main(String[] args) {
        String naam = "ashish";
//       str = str.toLowerCase();
//       int len = str.length();
//       boolean ans = true;
//       for (int i=0;i<len/2;i++){
//           if(str.charAt(i) != str.charAt(len - i - 1)){
//               ans = false;
//               break;
//           }
//       }
//       if (ans){
//           System.out.println("given string is palindrome");
//       }
//       else{
//           System.out.println("Given string not palindrome");
//       }
//
        plain(naam);
    }
    static void plain(String name){
        String str = name.toLowerCase();
        int len = str.length();
        boolean ans = true;
        for (int i = 0 ; i<len/2 ; i++){
            if (str.charAt(i) != str.charAt(len - i - 1)){
                ans = false;
                break;
            }
        }
        if (ans){
            System.out.println("Yes palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
