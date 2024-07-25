package com.Ashish.All.OOPS.properties.Polymorphism;

public class Circle extends Shapes{

    //this will run when the object of circle is created
    //Hence it override the parent method
    @Override // this is a simple Annotation
    void area(){
        System.out.println("Area is pi * r * r");
    }
}
