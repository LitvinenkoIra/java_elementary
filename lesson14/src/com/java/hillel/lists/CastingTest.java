package com.java.hillel.lists;

public class CastingTest {

    public static void main(String[] args) {

        Object obj = new Cat();

        Cat cat = (Cat) obj;

        cat.voice();
    }
}
