package com.Ashish.All.OOPS.Interface.NestedInterface;

public class A {

    //nested interface

    public interface nested {
        boolean isodd(int num);
    }
}
class B implements A.nested{

    @Override
    public boolean isodd(int num) {
        return ((num&1) == 1) ;
    }
}
