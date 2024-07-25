package com.Ashish.All.OOPS.properties.Inheritance;

public class BoxColor extends Box{
    String color ;

    BoxColor(){
        this.color = "White";
    }

    public BoxColor(double l, double h, double w, String color) {
        super(l, h,w);
        this.color = color;
    }

    BoxColor(BoxColor other){
        super(other);
        color = other.color;
    }
}
