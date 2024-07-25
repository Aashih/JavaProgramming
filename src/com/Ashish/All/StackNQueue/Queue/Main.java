package com.Ashish.All.StackNQueue.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue l1 = new CustomQueue(6);
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.insert(60);
        l1.display();
////        System.out.println();
////
////        System.out.println(l1.remove()); // while removing the item from give takes O(n) TC which is not good
////        l1.display();
////
////        System.out.println();
////        System.out.println(l1.front());

//        CircularQueue l1 = new CircularQueue(5);
//        l1.insert(10);
//        l1.insert(20);
//        l1.insert(30);
//        l1.insert(40);
//        l1.insert(50);
////        System.out.println(l1.insert(60));
//        l1.display();
//        System.out.println();
//
//        System.out.println(l1.remove()); // this will take O(1) TC
//        l1.insert(60);
//        l1.display();
//        System.out.println();
//
//        System.out.println(l1.remove());
//        System.out.println(l1.remove());
//        System.out.println(l1.remove());
//        System.out.println(l1.remove());
//        System.out.println(l1.remove());
//
//        System.out.println();
//        System.out.println("Using Dynamic Circular Queue");
//        DynamicCircularQueue l2 = new DynamicCircularQueue(5);
//        l2.insert(10);
//        l2.insert(20);
//        l2.insert(30);
//        l2.insert(40);
//        l2.insert(50);
//        l2.insert(60);
//        l2.insert(70);
//        l2.display();
    }
}
