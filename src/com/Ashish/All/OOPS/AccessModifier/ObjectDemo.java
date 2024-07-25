package com.Ashish.All.OOPS.AccessModifier;

public class ObjectDemo extends A {
    int num;

    public ObjectDemo(int num, String name, int num1) {
        super(num, name);
        this.num = num1;
    }

    //Already study
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
    @Override
    public int hashCode() {
        return super.hashCode();
        //Hashcode means a unique representation of object via a number
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo ob1 = new ObjectDemo(43,"Ashh",40);
        ObjectDemo ob2 = new ObjectDemo(43,"Ashh",40);
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1 instanceof Object);

    }
}
