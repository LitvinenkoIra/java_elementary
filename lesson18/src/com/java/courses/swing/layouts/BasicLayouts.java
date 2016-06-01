package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;

public class BasicLayouts {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*UIManager.getLookAndFeelDefaults()
                        .put("defaultFont", new Font("Arial", Font.BOLD, 24));*/

                new MainForm();
                //new GridForm();
            }
        });
    }
}