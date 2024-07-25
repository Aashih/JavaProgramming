package com.Ashish.All.LinkedList.Circular;

public class Main {
    public static void main(String[] args) {
        InsertionNdeletion list = new InsertionNdeletion();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.delete(30);
        System.out.println();
        list.display();
    }
}
