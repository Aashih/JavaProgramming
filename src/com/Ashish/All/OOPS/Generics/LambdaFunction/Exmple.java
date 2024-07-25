package com.Ashish.All.OOPS.Generics.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exmple {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(i+1);
        }

//        arr.forEach((item) -> System.out.println(item*2));  // this is known as lambda function

        //OR

        Consumer<Integer> sum = item -> System.out.println(item*2);
        arr.forEach(sum);
    }
}
