package com.java.courses.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsJavaTest {

    public static void main(String[] args) {

        ExceptionsJavaTest test = new ExceptionsJavaTest();
        try {
            test.doSomething();
        } catch (NetworkException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public void doSomething() throws NetworkException, FileNotFoundException {

        if (somethingWrongWithNetwork()) {
            throw new NetworkException("Network is unreachable");
        }

        if (cantReadFile()) {
            throw new FileNotFoundException("File not found");
        }

    }

    public boolean somethingWrongWithNetwork() {
        return false;
    }

    public boolean cantReadFile() {
        return true;
    }
}
