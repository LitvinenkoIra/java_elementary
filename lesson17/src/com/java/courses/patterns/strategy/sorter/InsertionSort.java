package com.java.courses.patterns.strategy.sorter;

public class InsertionSort implements SorterStrategy {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = i; j > 0; j--) {
                if (array[j - 1] <= array[j])
                    break;

                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
    }
}
