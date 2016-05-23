package com.java.courses.patterns.strategy.sorter;

public class BubleSort implements SorterStrategy {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
    }
}
