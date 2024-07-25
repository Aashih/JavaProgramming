package com.Ashish.All.OOPS.Staticemple;

public class InnerClass {
    static class test {  //  if we won't make this class static it will thorw an error because in static :
        //when we declear any member as a static is will be called before any other object of class
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a = new test("Ashish");
        test b = new test("Devil");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
