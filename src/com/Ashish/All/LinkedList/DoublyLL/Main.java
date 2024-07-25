package com.Ashish.All.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        InsertNDeletion list = new InsertNDeletion();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();
        list.InsertLast(5);
        list.InsertLast(10);

        list.display();
        list.insertAfter(30,100);
        list.display();

    }
}
