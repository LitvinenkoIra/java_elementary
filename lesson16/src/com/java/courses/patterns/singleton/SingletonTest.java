package com.java.courses.patterns.singleton;

import com.java.courses.equality.Person;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.printSomething();

        Person p1 = new Person("John", "Smith", 34);
        Person p2 = new Person("John", "Smith2", 38);
        Person p3 = new Person("John", "Smith3", 35);
        Person p4 = new Person("John", "Smith3", 34);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        int cnt = 0;
        for (Person person : persons) {
            if (person.getAge() == 34) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
