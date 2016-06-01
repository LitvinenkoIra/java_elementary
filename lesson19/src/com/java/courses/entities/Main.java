package com.java.courses.entities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person john = new Person();
        Person sam = new Person();
        Car car = new Car();

        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(sam);

        City city = new City(people);
        city.setCar(car);
    }
}
