package com.collections.lists;

import java.util.Iterator;

public class BackwardListIterator implements Iterator {

    int current;
    String[] array;
    int size;

    BackwardListIterator(String[] array, int size) {
        this.array = array;
        this.size = size;
        this.current = size - 1;
    }

    @Override
    public boolean hasNext() {
        if (current < 0) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        String element = array[current];
        current--;
        return element;
    }
}
