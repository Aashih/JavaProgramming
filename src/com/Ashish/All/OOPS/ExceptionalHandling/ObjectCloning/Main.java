package com.Ashish.All.OOPS.ExceptionalHandling.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ob1 = new Human(20,"Ashish");
        System.out.println(ob1.age);
//        Human ob2 = new Human(ob1);  // this will take more time that's why we use object cloning
//        System.out.println(ob2.name);

        Human ob2 = (Human)ob1.clone();
        System.out.println(ob2.name + " " + ob2.age);
        System.out.println(Arrays.toString(ob2.arr));

        ob2.arr[0] = 40;
        System.out.println(Arrays.toString(ob2.arr));
        System.out.println(Arrays.toString(ob1.arr));
    }
}
