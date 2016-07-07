package com.java.courses.exceptions;

public class ErrorTest {

    public static void main(String[] args) {
        int i = 5;
        someMethod(i);
    }

    public static void someMethod(int i) {
        if (i == 5) {
            someMethod(i);
        }
    }
}
