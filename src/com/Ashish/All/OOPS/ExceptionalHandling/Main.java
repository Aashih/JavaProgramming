package com.Ashish.All.OOPS.ExceptionalHandling;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        try {
            System.out.println(divide(a,b));
        }catch (ArithmeticException e){  //or (Exception e)

            //System.out.println("Error Occur");

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("It always run");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("This is not allowed");
        }
        return a/b;
    }
}
