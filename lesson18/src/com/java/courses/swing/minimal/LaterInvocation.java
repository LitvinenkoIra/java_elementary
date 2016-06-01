package com.java.courses.swing.minimal;

import javax.swing.*;

public class LaterInvocation {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new SwingApplication());
    }
}

class SwingApplication implements Runnable {

    @Override
    public void run() {
        JFrame frame = new JFrame("Minimal Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}