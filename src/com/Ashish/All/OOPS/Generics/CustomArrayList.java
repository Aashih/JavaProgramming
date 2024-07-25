package com.Ashish.All.OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int defaultSize = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[defaultSize];
    }

    public void add(int n) {
        if (isfull()) {
            resize();
        }
        data[size++] = n;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int item = data[--size];
        return item;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    private void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private boolean isfull() {
        return (size == data.length);
    }

    public static void main(String[] args) {
        CustomArrayList ob1 = new CustomArrayList();
        ob1.add(10);
       // ob1.add('d');  this is the problem that solved by generics
        ob1.add(20);
        ob1.add(30);
        ob1.add(40);

//        for (int i = 0; i < 15; i++) {
//            ob1.add(i*3);
//        }
        System.out.println(ob1);
    }
}