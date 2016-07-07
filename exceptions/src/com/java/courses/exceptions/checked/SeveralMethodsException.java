package com.java.courses.exceptions.checked;

public class SeveralMethodsException {

    public static void main(String[] args) {
        SeveralMethodsException several = new SeveralMethodsException();

        try {
            several.methodFirst();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void methodFirst() throws Exception {
        methodSecond();
    }

    public void methodSecond() throws Exception {
        methodThird();
    }

    public void methodThird() throws Exception {
        throw new Exception("Something wrong happened");
    }
}
