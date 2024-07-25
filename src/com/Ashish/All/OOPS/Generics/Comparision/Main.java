package com.Ashish.All.OOPS.Generics.Comparision;

public class Main {
    public static void main(String[] args) {
        Student raman = new Student(10,34.5f);
        Student sivam = new Student(20,65.4f);

        if (raman.compareTo(sivam) < 0){
            System.out.println(raman.compareTo(sivam));
            System.out.println("Sivam has more mrks then raman");
        }
    }
}
