package com.Ashish.All.OOPS.Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardsExample<T extends Number> { //Now by doing this you can only store int,float,double
                                                  //Which is of Number type other then these nothing allowed
    private Object[] data;
    private static int defaultSize = 10;
    private int size = 0;

    public WildCardsExample() {
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

    public void getList(List<? extends Number> list){

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
        WildCardsExample<Double> list1 = new WildCardsExample<>();
        list1.add(10.3);
        list1.add(20.5);
        list1.add(30.2);
        list1.add(40.6);
        System.out.println(list1);

//        WildCardsExample<String> list2 = new WildCardsExample<>();
//           you cannot store string
          // in this ArrayList because above you have specify that it will only store Number type
        //this is know as WildCard


//        list2.add("Hello");
//        list2.add("How");
//        list2.add("Are");
//        list2.add("You");
//        System.out.println();
//        System.out.println(list2);
    }
}
