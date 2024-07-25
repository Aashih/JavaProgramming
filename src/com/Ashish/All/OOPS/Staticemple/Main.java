package com.Ashish.All.OOPS.Staticemple;

public class Main {
    public static void main(String[] args) {
        Human ob1 = new Human(20,"Ashish","Delhi",80999);
        Human ob2 = new Human(25,"Aneesh","Bombay",80000);
        System.out.println(ob1.name);
        System.out.println(ob1.Place);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
