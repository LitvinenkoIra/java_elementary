import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    Player playerX;
    Player playerO;
    Player currentPlayer;
    char winner;

    public Board(Player playerX, Player playerO) {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }

        this.playerX = playerX;
        this.playerO = playerO;
        currentPlayer = playerX;
        winner = ' ';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean gameFinished() {
        if (winHorizontal() || winVertical() || winDiagonal()) {
            return true;
        }
        return false;
    }


    private boolean winHorizontal() {
        if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')) {
            winner = 'X';
            return true;
        }
        if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')) {
            winner = 'O';
            return true;
        }
        return false;
    }

    private boolean winVertical() {
        if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') || (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')) {
            winner = 'X';
            return true;
        }
        if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')) {
            winner = 'O';
            return true;
        }
        return false;
    }

    private boolean winDiagonal() {
        if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
            winner = 'X';
            return true;
        }
        if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
            winner = 'O';
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

    private void changeCurrentPlayer() {

        if (currentPlayer.getType() == 'X') {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0 || board[x][y]!=' ') {
            return false;
        }
        return true;
    }

    public Player calculateWinner() {

        if (currentPlayer.getType() == winner)
            return currentPlayer;
        else {
            changeCurrentPlayer();
            return currentPlayer;
        }
    }

    public Player calculateLoser() {

        if (currentPlayer.getType() != winner)
            return currentPlayer;
        else {
            changeCurrentPlayer();
            return currentPlayer;
        }
    }
}
