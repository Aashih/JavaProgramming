package com.Ashish.All.StackNQueue.Stack.CustomNDynamicStack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack s1 = new CustomStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        System.out.println("Using custom stack");
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println();
//        System.out.println(s1.pop());

        System.out.println("Using Dynamic Stack");
        DynamicStack d1 = new DynamicStack(5);
        d1.push(1);
        d1.push(2);
        d1.push(3);
        d1.push(4);
        d1.push(5);
        d1.push(6); // add more item then the size of stack using dynamic stack

        System.out.println(d1.pop());
        System.out.println(d1.pop());
        System.out.println(d1.pop());
        System.out.println(d1.pop());
        System.out.println(d1.pop());
        System.out.println(d1.pop());

    }
}
