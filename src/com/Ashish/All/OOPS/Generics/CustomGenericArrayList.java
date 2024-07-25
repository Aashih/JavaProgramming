package com.Ashish.All.OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int defaultSize = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[defaultSize];
    }

    public void add(T n) {
        if (isfull()) {
            resize();
        }
        data[size++] = n;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T item = (T)(data[--size]);
        return item;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    private void set(int index, T value) {
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
        CustomGenericArrayList<Integer> list1 = new CustomGenericArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("Hello");
        list2.add("How");
        list2.add("Are");
        list2.add("You");
        System.out.println();
        System.out.println(list2);
    }
}
