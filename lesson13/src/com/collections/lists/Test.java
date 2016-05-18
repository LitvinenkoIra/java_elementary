package com.collections.lists;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("Forward iterator");

        Iterator it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        System.out.println("Backward iterator");
        System.out.println();

        Iterator bit = list.backwardIterator();
        while (bit.hasNext()) {
            System.out.println("Element: " + bit.next());
        }

        System.out.println();
        System.out.println(list);
    }
}
