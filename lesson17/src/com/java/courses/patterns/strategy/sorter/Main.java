package com.java.courses.patterns.strategy.sorter;

public class Main {

    public static void sout(int[] array){
        for (int i = 0; i < array.length; i ++)
            System.out.print(array[i] + " ");
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {4, 3, 2, 9, 6, 0, 1, 5};

        System.out.println("Buble sort");
        SorterWithStrategy sorterWithStrategy = new SorterWithStrategy(new BubleSort());
        sorterWithStrategy.sort(array);
        sout(array);

        System.out.println("Insertion sort");
        SorterWithStrategy sorterWithStrategy1 = new SorterWithStrategy(new InsertionSort());
        sorterWithStrategy1.sort(array);
        sout(array);

        System.out.println("Selection sort");
        SorterWithStrategy sorterWithStrategy2 = new SorterWithStrategy(new SelectionSort());
        sorterWithStrategy2.sort(array);
        sout(array);
    }
}
