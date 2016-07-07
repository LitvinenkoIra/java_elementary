package com.java.courses.exceptions.unchecked;

public class Initializer {

    {
        int k = 5;
        k = k / 0;
    }

    public Initializer() {
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        Initializer initializer = new Initializer();
    }
}
