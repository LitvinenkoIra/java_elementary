package com.java.hillel.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest2 {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal parrot = new Parrot();

        List animals = new ArrayList();
        animals.add(cat);
        animals.add(dog);
        animals.add(parrot);
        animals.add(new Random()); //нет ошибки компиляции, но тип данных не соответствует

        Animal animal = (Animal) animals.get(0);
        animal.voice();

        //ошибка при выполнении
        Animal animal_rnd = (Animal) animals.get(3);
        animal_rnd.voice();
    }
}
