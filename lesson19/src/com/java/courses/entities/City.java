package com.java.courses.entities;

import java.util.List;

public class City {

    private Car car;
    private List<Person> people;

    public City(List<Person> people) {
        this.people = people;
        System.out.println("City has been created");
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
