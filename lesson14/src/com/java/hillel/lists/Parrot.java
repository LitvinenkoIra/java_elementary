package com.java.hillel.lists;

public class Parrot extends Animal {

    Parrot() {
        //super();
        super("Some name");
        System.out.println("In Parrot constructor");
    }

    Parrot(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Parrot");
    }

    @Override
    public String toString() {
        return name;
    }
}
