package com.java.courses.patterns.strategy.main;

public class Compiler {

    private CompilerStrategy strategy;

    public Compiler(CompilerStrategy strategy) {
        this.strategy = strategy;
    }

    /*
    public void setStrategy(CompilerStrategy strategy) {
        this.strategy = strategy;
    }
    */

    public void compile(String code) {
        strategy.compile(code);
    }
}
