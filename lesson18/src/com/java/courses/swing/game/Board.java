package com.java.courses.swing.game;

import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    Player playerX;
    Player playerO;
    Player currentPlayer;

    public Board(Player playerX, Player playerO) {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }

        this.playerX = playerX;
        this.playerO = playerO;
        currentPlayer = playerX;
    }

   /* public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }*/

    public boolean gameFinished() {
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        }
        return false;
    }

    public boolean makeMove() {
        String move = currentPlayer.makeMove();
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

        if (!isMoveValid(x, y))
            return false;

        board[x][y] = currentPlayer.getType();
        changeCurrentPlayer();

        return true;
    }

    public char makeMove(String move) {
        //String move = currentPlayer.makeMove();
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

        char current = currentPlayer.getType();
        board[x][y] = current;

        changeCurrentPlayer();

        return current;
    }

    private void changeCurrentPlayer() {

        if (currentPlayer.getType() == 'X') {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }
        return true;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player calculateWinner() {
        return currentPlayer;
    }

    public Player calculateLoser() {
        return currentPlayer;
    }
}
