package com.java.courses.exceptions.unchecked;

public class UncheckedExceptions {

    public static void main(String[] args) {

        UncheckedExceptions exceptions = new UncheckedExceptions();
        //exceptions.divisionByZero();

        int[] arr = {1, 2, 3};
        int result = exceptions.getElement(arr, 5);
    }

    public void divisionByZero() {
        int k = 5;
        k = k / 0;
    }

    public int getElement(int[] array, int index) {
        int element = array[index];
        return element;
    }
}
