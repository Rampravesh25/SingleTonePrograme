package com.bl.singalton;

// our goal is to create a class that can have only one object.
public class SingaltonClass {

    private static SingaltonClass sc;
    //creating a reference object.

    private SingaltonClass() {

    }
    //creating private constructor sos we cant use that constructor outside the class.
    // to create a Method which refer to only one object of the class.

    public static SingaltonClass getInstance() {
        if (sc == null) {
            sc = new SingaltonClass();
        }
        return sc;
    }

    public void print() {
        System.out.println("Hello World !!!");
    }
}

class Main {
    public static void main(String[] args) {
        SingaltonClass singaltonClass;
        singaltonClass = SingaltonClass.getInstance();
        singaltonClass.print();
        SingaltonClass s1;
        s1 = SingaltonClass.getInstance();
        s1.print();
        SingaltonClass s2;
        s2 = SingaltonClass.getInstance();
        s2.print();
    }
}

