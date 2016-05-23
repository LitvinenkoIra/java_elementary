package com.java.courses.patterns.strategy.main;

public class CompilerJava implements CompilerStrategy {

    @Override
    public void compile(String code) {
        System.out.println("compiled in Java: " + code);
    }
}
