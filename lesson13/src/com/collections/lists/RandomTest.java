package com.collections.lists;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println(number);
    }
}
