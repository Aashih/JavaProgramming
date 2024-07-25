package com.Ashish.All.OOPS.ExceptionalHandling;

public class MyExceptionMain {
    public static void main(String[] args) {
        try{
            String n = "Ash";
            if (n.equals("Ashish")){
                throw new MyException("YES my name is Ashish");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
