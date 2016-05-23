package com.java.courses.patterns.strategy.main;

public class CompilerCSharp implements CompilerStrategy {

    @Override
    public void compile(String code) {
        System.out.println("compiled in C#: " + code);
    }
}
