package com.Ashish.All.OOPS.CLaSS;

import com.Ashish.All.OOPS.AccessModifier.A;

public class ExampleAccessModifierAbove extends A {
    public ExampleAccessModifierAbove(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        ExampleAccessModifierAbove ob1 = new ExampleAccessModifierAbove(54,"Ashish");
        System.out.println(ob1.num);
    }
}
