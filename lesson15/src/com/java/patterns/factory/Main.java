package com.java.patterns.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        TeaFactory teaFactory = new TeaFactory();
        Tea tea = teaFactory.makeTea(input);

        tea.makeCupOfTea();
    }
}
