package com.java.courses.patterns.strategy.main;

public class MainApplication {

    public static void main(String[] args) {

        Compiler compiler = new Compiler(new CompilerJava());

        /* if we use setter
        CompilerStrategy strategy = new CompilerJava();
        compiler.setStrategy(strategy);
        */

        compiler.compile("Some code");
    }
}
