package com.java.courses.exceptions;

public class ExceptionsTest {

    public static void main(String[] args) {

        ExceptionsTest exceptionsTest = new ExceptionsTest();
        int result = exceptionsTest.doSomething();

        if (result == -1) {
            System.out.println("Network issues");
        }

        if (result == -2) {
            System.out.println("File does not exist");
        }
    }

    public int doSomething() {
        //some logic

        /*
        if (somethingWrongWithNetwork()) {
            return -1;
        }

        if (cantReadFile()) {
            return -2;
        }
        */

        return 0;
    }
}
