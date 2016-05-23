package com.java.courses.patterns.factory_method;

public class FactoryTest {

    public static void main(String[] args) {

        Student student = Student.newInstance("Sam", 35);

        //Student student2 = new Student("Sam", 35); can't do, because constructor is private
    }
}
