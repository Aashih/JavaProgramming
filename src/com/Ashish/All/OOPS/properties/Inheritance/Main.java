package com.Ashish.All.OOPS.properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        System.out.println(b1.l + " " + b1.h + " " + b1.w);
//
//        Box b2 = new Box(10);
//        System.out.println(b2.l + " " + b2.h + " " + b2.w);
//        System.out.println();
//
//        Box b3 = new Box(2.3,4.5,6.7);
//        System.out.println(b3.l + " " + b3.h + " " + b3.w);
//
//        Box b4 = new Box(b2);  // copies the value of b2 oj=bject
//        System.out.println(b4.l + " " + b4.h + " " + b4.w);
//        System.out.println();
//
//        BoxWeight bw1 = new BoxWeight();
//        System.out.println(bw1.l + " " + bw1.weight); //copys the value of l
//        //from Box class

//        BoxWeight bw2 = new BoxWeight(3.4,5.3,8.5,9.0);
//        System.out.println(bw2.l + " " + bw2.h + " " + bw2.w + " " + bw2.weight);





        
//        Box b1 = new BoxWeight(5,4,6,3);
//        // when the reference to a subclass object is assingned to a superclass reference variable
//        //You can only access those part of object which is define by the superclass
//        System.out.println(b1.l + " " + b1.h + " " + b1.w);//(b1.weight // error);

        BoxColor Bc = new BoxColor();
        System.out.println(Bc.color+" " + Bc.l + " " + Bc.h + " " + Bc.w);

        BoxColor Bc1 = new BoxColor(2,54,6.4,"Yellow");
        System.out.println(Bc1.color+" " + Bc1.l + " " + Bc1.h + " " + Bc1.w);

        BoxColor Bc2 = new BoxColor(Bc);
        System.out.println(Bc2.color+" " + Bc2.l + " " + Bc2.h + " " + Bc2.w);
    }


}
