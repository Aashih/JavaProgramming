package com.Ashish.All.String.StringBuffer;

public class Example {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //by default the capacity = 16

        //Constructor 1
        sb.append("Ashish");

        //Constructor 2
        StringBuffer sb2 =new StringBuffer("Hello");

        //Constructor
        StringBuffer sb3 = new StringBuffer(30);

        sb.append(" Panchtilak");

        //to insert att particular index
        sb.insert(6," Surname");

        //to replace
        sb.replace(1,4,"SHI"); // end index is not included
        sb.delete(1,4);

        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb3.capacity());
    }
}
