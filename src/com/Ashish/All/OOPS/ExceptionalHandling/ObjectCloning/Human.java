package com.Ashish.All.OOPS.ExceptionalHandling.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr = new int[]{1,2,3,4,5};

    public Human() {
        this.age = 10;
        this.name = "Ashish";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;

    }

    Human(Human other){
        this.age = other.age;
        this.name = other.name;
        this.age = other.age;
    }

//    public Object clone() throws CloneNotSupportedException{
//        //This is Shallow copy   //modify both the array
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();

        //This is deep cloning
        twin.arr = new int[twin.arr.length]; //modify only specif array
        for (int i = 0; i <twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
