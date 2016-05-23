package com.java.courses.patterns.strategy.base;

public class Compiler {

    private String language;

    public Compiler(String language) {
        this.language = language;
    }

    public void compile(String code) {
        switch (language) {
            case "C#":
                compileWithCSharp(code);
                break;
            case "C++":
                compileWithCTwoPlus(code);
                break;
            case "Java":
                compileWithJava(code);
                break;
        }
    }

    private void compileWithCSharp(String code) {
        System.out.println("compiled in C#: " + code);
    }

    private void compileWithCTwoPlus(String code) {
        System.out.println("compiled in C++: " + code);
    }

    private void compileWithJava(String code) {
        System.out.println("compiled in Java: " + code);
    }
}
