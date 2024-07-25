package com.Ashish.All.OOPS.Staticemple;

public class StaticBlock {
    static int a = 10;
    static int b;

    //this will run only once , when the first object is created means when the class is loaded first time
    static {
        System.out.println("It is a static block");
        b = 2*a;
    }

    public static void main(String[] args) {
        StaticBlock ob1 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+StaticBlock.b);
        StaticBlock.b=b+10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock ob2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
