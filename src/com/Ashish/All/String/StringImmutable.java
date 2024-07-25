package com.Ashish.All.String;

public class StringImmutable {
    public static void main(String[] args) {
        String a = new String("Ashish");
        String b = new String("Ashish");
        System.out.println(a==b); // this will give false because a and b both r
        //points to diffrent object
        System.out.println(a.equals(b));

    }
}
