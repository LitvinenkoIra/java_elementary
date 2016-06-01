package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Toolbar extends JPanel {

    private JButton buttonHello = new JButton("Hello");
    private JButton buttonGoodbye = new JButton("Goodbye");
    private List<JButton> buttons;

    public void setButtons(List<JButton> buttons) {
        this.buttons = buttons;
    }

    public Toolbar() {
        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);
        setLayout(layoutManager);

        add(buttonHello, layoutManager);
        add(buttonGoodbye, layoutManager);

        buttonHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });

        buttonGoodbye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton btn : buttons) {
                    btn.setText("");
                }
            }
        });
    }
}
