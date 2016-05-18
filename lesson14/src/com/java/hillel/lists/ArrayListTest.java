package com.java.hillel.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        /*
        Animal animal = new Parrot();
        animal.voice();
        */

        /*
        Animal[] animals = new Parrot[5];
        animals[0] = new Parrot();
        animals[1] = new Cat();
        */

        List<Parrot> parrotList = new ArrayList<Parrot>();
        parrotList.add(new Parrot("First"));
        parrotList.add(new Parrot("Second"));
        parrotList.add(new Parrot("Third"));

        //standard for
        for (int i = 0; i < parrotList.size(); i++) {
            Parrot parrot = parrotList.get(i);
            System.out.println(parrot);
        }

        System.out.println();

        //alternative foreach
        for (Parrot parrot : parrotList) {
            System.out.println(parrot);
        }

    }
}
