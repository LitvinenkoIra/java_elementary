package com.java.courses.patterns.strategy.main;

import com.java.courses.patterns.strategy.base.*;

public class MainApplicationWithAnonymous {

    public static void main(String[] args) {

        Compiler compiler = new Compiler(new CompilerStrategy() {
            @Override
            public void compile(String code) {
                System.out.println("compiled with Haskel: " + code);
            }
        });

        compiler.compile("some code");
    }
}
