package com.Ashish.All.Recursion.String;

public class SkipString {
    public static void main(String[] args) {
        String str = "asdwbananagf";
        System.out.println(skip(str));
    }
    static String skip(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("banana")){
            return skip(str.substring(6));
        }else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

//    by putting string as a argument
//    static void skip(com.Ashish.All.String str,com.Ashish.All.String news){
//        if (str.isEmpty()){
//            System.out.println(news);
//            return;
//        }
//        if (str.startsWith("banana")){
//            skip(str.substring(6),news);
//        }else{
//            skip(str.substring(1),news + str.charAt(0));
//        }
//    }
}
