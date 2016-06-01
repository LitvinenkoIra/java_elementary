package com.java.courses.swing.layouts;

import com.java.courses.swing.game.AI;
import com.java.courses.swing.game.Board;
import com.java.courses.swing.game.Human;
import com.java.courses.swing.game.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainForm extends JFrame {

    private JTextArea textArea;
    private JButton button;

    public MainForm() {
        super("Basic Layouts");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = screen.width;
        int y = screen.height;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)Math.round(x * 0.8), (int)Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        textArea = new JTextArea();
        button = new JButton("Click Me");

        Dimension textAreaSize = textArea.getPreferredSize();
        //System.out.println(textAreaSize.width + ":" + textAreaSize.height);

        textAreaSize.width = 600;
        textAreaSize.height = 100;
        textArea.setPreferredSize(textAreaSize);

        Player playerX = new Human("Ivanov", "Ivan", "Petrovich", 25, 'X');
        Player playerO = new AI("Petrov", "Petr", "Petrovich", 35, 'O');

        Board board = new Board(playerX, playerO);

        List<JButton> list = new ArrayList<>();
        GridForm gridForm = new GridForm(board, list);
        gridForm.setTextArea(textArea);

        Toolbar toolbar = new Toolbar();
        toolbar.setButtons(list);

        add(textArea, BorderLayout.EAST);
        add(gridForm, BorderLayout.WEST);
        add(button, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea.append("Some string\n");
                String str = textArea.getText();
                JOptionPane.showMessageDialog(null, str);
            }
        });
    }
}
