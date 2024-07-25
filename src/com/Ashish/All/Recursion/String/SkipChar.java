package com.Ashish.All.Recursion.String;

public class  SkipChar {
    public static void main(String[] args) {
        String str = "bsaaad";
        System.out.println(skip(str));
//        System.out.println(skip(str, new StringBuilder(),0));
    }

    //Using recursion Without taking a new string as an argument
    static String skip(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            return skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }
//Using com.Ashish.All.Recursion (Kunal's method- With taking new string as a argument !!
//    static void skip(com.Ashish.All.String str,com.Ashish.All.String strn){
//
//        if (str.isEmpty()){
//            System.out.println(strn);
//            return;
//        }
//        char ch = str.charAt(0);
//        if (ch == 'a'){
//            skip(str.substring(1),strn);
//        }else {
//            skip(str.substring(1),strn+ch);
//        }
//    }



    //Normal method:-
//    static com.Ashish.All.String skip(com.Ashish.All.String str){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0 ; i<str.length() ; i++){
//            if (str.charAt(i) != 'a'){
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
}
