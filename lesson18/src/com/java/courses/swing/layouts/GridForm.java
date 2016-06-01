package com.java.courses.swing.layouts;

import com.java.courses.swing.game.Board;
import com.java.courses.swing.game.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GridForm extends JPanel {

    private Board board;
    private JTextArea area;
    private List<JButton> buttons;

    public void setTextArea(JTextArea area) {
        this.area = area;
    }

    public GridForm(Board board, List<JButton> buttons) {

        this.board = board;
        this.buttons = buttons;

        Dimension dimension = new Dimension();
        dimension.width = 100;
        dimension.height = 100;

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("");
            button.setPreferredSize(dimension);

            int x = i / 3;
            int y = i % 3;

            gc.gridx = x;
            gc.gridy = y;

            button.setName(String.valueOf(x) + String.valueOf(y));

            add(button, gc);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton) e.getSource();
                    String move = btn.getName();

                    char type = board.makeMove(move);
                    btn.setText(String.valueOf(type));

                    if (board.gameFinished()) {
                        Player player = board.calculateWinner();
                        JOptionPane.showMessageDialog(null, "Game Finished. Winner: " + player);
                        area.append("Winner is " + player);
                    }
                }
            });

            buttons.add(button);
        }
    }
}
