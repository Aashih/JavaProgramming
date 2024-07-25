package com.Ashish.All.OOPS.CLaSS;

import com.Ashish.All.OOPS.AccessModifier.A;

//Creating a class
//for every single student
class Student{
    int roll;
    String name;
    float marks; // default values
//        float marks = 9.8f; // default values

    void greeting() {
        System.out.println("Good Morning!" + name);
    }

    void changename(String name) {
        this.name = name;
    }

    Student() {  // it is know as constructor
//            this.roll = 20; // this keyword is use to access the every object
//            this.name = "Ashish Panchtilak";
//            this.marks = 7.9f;

        //this is how you can call a constructor from another constructor
        this(10, "Alexa", 98.5f);
    }

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
        public static void main(String[] args) {
            Student[] student = new Student[5];
            //creating a new object(ashish)
            //of a class student
    //        Student ashish = new Student();
    //        ashish.roll = 20;
    //        ashish.name = "Ashish Panchtilak";
    //        ashish.marks = 7.9f;    // this is only used of any one object

            Student rocky = new Student();
            System.out.println(rocky.roll);
            System.out.println(rocky.name);
            System.out.println(rocky.marks);
            System.out.println();

            rocky.greeting();
            rocky.changename("Ashish");
            rocky.greeting();
            System.out.println();

            Student ashish = new Student(12,"Virat Kohli",89.5f);
            System.out.println(ashish.roll);
            System.out.println(ashish.name);
            System.out.println(ashish.marks);
            System.out.println();

            Student another = new Student();
            System.out.println(another.roll);
            System.out.println(another.name);
            System.out.println(another.marks);

            System.out.println();
            A ob1 = new A(10,"Ammy");
//            System.out.println(ob1.getNum());

        }
    }

