package com.java.courses.equality;

public class EqualsTest {

    public static void main(String[] args) {

        Person p1 = new Person("John", "Smith", 25);
        Person p2 = new Person("John", "Smith", 23);

        System.out.println("== test:");

        if (p1 == p2) {
            System.out.println("Persons are equals");
        } else {
            System.out.println("Persons are not equals");
        }

        System.out.println();

        System.out.println("equals test:");

        if (p1.equals(p2)) {
            System.out.println("Persons are equals");
        } else {
            System.out.println("Persons are not equals");
        }

    }
}
