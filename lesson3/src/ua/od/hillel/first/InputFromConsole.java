package ua.od.hillel.first;

import java.util.Scanner;

public class InputFromConsole {

    public static void main(String[] args) {

        int a = 0, b = 0;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.println("First parameter: " + a);
        System.out.println("Second parameter: " + b);

        System.out.println("Sum of the numbers is " + (a + b));
    }
}
