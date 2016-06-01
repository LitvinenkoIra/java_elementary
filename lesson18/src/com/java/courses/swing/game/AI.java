package com.java.courses.swing.game;

import java.util.Random;

public class AI extends Player {
    public AI(String lastname, String firstname, String middlename, int age, char type) {
        super(lastname, firstname, middlename, age, type);
    }

    @Override
    public String makeMove() {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);
        return String.valueOf(x) + String.valueOf(y);
    }
}
