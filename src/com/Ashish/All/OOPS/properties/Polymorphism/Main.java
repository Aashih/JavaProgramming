package com.Ashish.All.OOPS.properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes c1 = new Circle();
        Shapes shp = new Shapes();
        Square sqr = new Square();
        Triangle tri = new Triangle();
//        Shapes tri = new Triangle(); this can be possible

//        shp.area();
//        c1.area();
        sqr.area();
          c1.area();
         shp.area();
    }
}
