package com.java.elementary.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.elementary.game.*;

import java.util.*;

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
        Player playerO = new Human("Petrov", "Petr", "Petrovich", 35, 'O');

        Board board = new Board(playerX, playerO);

        java.util.List<JButton> list = new ArrayList<>();
        GridForm gridForm = new GridForm(board, list);
        gridForm.setTextArea(textArea);
        Statistics statistics = new Statistics();
        gridForm.setStatistics(statistics);

        Toolbar toolbar = new Toolbar();
        toolbar.setButtons(list);
        toolbar.setBoard(board);
        toolbar.setTextArea(textArea);

        add(textArea, BorderLayout.EAST);
        add(gridForm, BorderLayout.WEST);
        add(button, BorderLayout.SOUTH);
        add(toolbar, BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.append( statistics.toString() + "\n");
               // JOptionPane.showMessageDialog(null, statistics);
            }
        });
    }
}
