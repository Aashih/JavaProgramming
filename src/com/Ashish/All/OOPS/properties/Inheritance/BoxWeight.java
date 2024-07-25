package com.Ashish.All.OOPS.properties.Inheritance;

public class BoxWeight extends BoxColor{ // extends used to inheritate(copy)
    // property of existing class ,Here (Box)
    double weight;

    BoxWeight(){
        this.weight = -1;

    }

    public BoxWeight(double l, double h, double w, double weight,String color) {
        super(l, h, w,color);   //Call the parent class constructor
        //Super is use to initialize value present in parent class

//        System.out.println(super.l);
        this.weight = weight;
    }


    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
}
