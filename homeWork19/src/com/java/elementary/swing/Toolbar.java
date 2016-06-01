package com.java.elementary.swing;

import com.java.elementary.game.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Toolbar extends JPanel {

    private JButton buttonHello = new JButton("Start");
    private JButton buttonGoodbye = new JButton("End");
    private List<JButton> buttons;
    private Board board;
    private JTextArea textArea;

    public void setButtons(List<JButton> buttons) {
        this.buttons = buttons;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }


    public Toolbar() {
        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);
        setLayout(layoutManager);

        add(buttonHello, layoutManager);
        add(buttonGoodbye, layoutManager);

        buttonHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello! Game started!");
            }
        });

        buttonGoodbye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton btn : buttons) {
                    btn.setText("");
                }
                board.clearBoard();
                textArea.setText(null);

            }
        });
    }
}
