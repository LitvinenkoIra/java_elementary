package com.java.elementary.swing;

import com.java.elementary.game.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.elementary.game.GameResult;
import com.java.elementary.game.Player;
import com.java.elementary.game.Statistics;

import java.util.List;

public class GridForm extends JPanel {

    private Board board;
    private JTextArea area;
    private List<JButton> buttons;
    Statistics statistics;


    public void setTextArea(JTextArea area) {
        this.area = area;
    }
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
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
            buttons.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton) e.getSource();
                    if (btn.getText() == "") {
                        String move = btn.getName();

                        char type = board.makeMove(move);
                        btn.setText(String.valueOf(type));
                    }

                    if (board.gameFinished()) {
                        Player player = board.calculateWinner();
                        JOptionPane.showMessageDialog(null, "Game Finished. Winner: " + player);
                        area.append("Winner is " + player + "\n");
                        for (JButton btnn : buttons)
                            btnn.setText("");
                        board.clearBoard();
                        GameResult resultWinner = new GameResult(board.calculateWinner(), "win");
                        GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
                        statistics.addResult(resultWinner);
                        statistics.addResult(resultLoser);
                    }
                }
            });
        }
    }
}