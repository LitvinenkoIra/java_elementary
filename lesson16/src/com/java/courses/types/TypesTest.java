package com.java.courses.types;

import com.java.courses.equality.Engineer;
import com.java.courses.equality.Person;

public class TypesTest {

    public static void main(String[] args) {

        Person person = new Person("John", "Smith", 25);

//        Class clazz = Class.forName("com.java.courses.type.Engineer");

        System.out.println(person.getClass().getName());

        System.out.println("Person and Person");
        if (person.getClass() == Person.class) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Person and Engineer");
        if (person.getClass() == Engineer.class) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("-----------------------");
        System.out.println("Person and Person");
        if (person instanceof Person) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Person and Engineer");
        if (person instanceof Engineer) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
