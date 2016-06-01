package com.java.courses.swing.game;

import java.util.Scanner;

public class Human extends Player {

    public Human(String lastname, String firstname, String middlename, int age, char type) {
        super(lastname, firstname, middlename, age, type);
    }

    @Override
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();
        return move;
    }
}
