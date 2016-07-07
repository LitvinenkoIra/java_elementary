package com.java.courses.exceptions.atm;

public class Person {

    public static void main(String[] args) {

        ATM atm = new ATM(100);

        try {
            atm.getMoney(500);
        } catch (InsufficientFundsException | NetworkException e) {
            System.out.println(e.getMessage());
        }
    }
}
