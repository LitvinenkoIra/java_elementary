import java.util.Arrays;

public class ProceduralGame {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        Arrays.fill(board, ' ');

        while (!gameFinished(board)) {
            System.out.println("Player " + currentPlayer + " moves...");
            System.out.println("Enter your move: ");
            String move = "12";
            makeMove(move, 'X', board);
        }

        char winner = calculateWinner(board);
    }

    public static char calculateWinner(char board[][]) {
        return 'X';
    }

    public static void makeMove(String move, char player, char[][] board) {
    }

    public static boolean gameFinished(char[][] board) {
        return false;
    }
}
