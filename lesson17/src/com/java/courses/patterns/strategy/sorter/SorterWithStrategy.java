package com.java.courses.patterns.strategy.sorter;

public class SorterWithStrategy {

    private SorterStrategy sorterStrategy;

    public SorterWithStrategy(SorterStrategy sorterStrategy) {
        this.sorterStrategy = sorterStrategy;
    }

    public void sort(int[] array) {
        sorterStrategy.sort(array);
    }
}
