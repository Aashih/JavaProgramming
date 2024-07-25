package com.Ashish.All.Basic;

public class PassByValue {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println("a = "+a+","+"b = "+b); //actual value is not change in main functio
        char ch = 'a';
        System.out.println(greet(ch));
        System.out.println(ch);
    }
    static char greet(char a){
        a = 'b';//creating a new object not modifying it
        return a;
    }

//    static void swap(int a , int b){
//        int tem = a;
//        a = b;
//        b = tem;
//        System.out.println("a = "+a+","+"b = "+b); //value will change only inside this fuction;
//    }
}
