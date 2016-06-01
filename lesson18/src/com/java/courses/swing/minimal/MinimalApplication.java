package com.java.courses.swing.minimal;

import javax.swing.*;

public class MinimalApplication {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minimal Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
