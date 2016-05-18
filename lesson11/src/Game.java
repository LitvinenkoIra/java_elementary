import java.io.Console;
import java.util.Scanner;

public class Game {


    public static void showStatistics(Board board, Player playerX, Player playerO){
        Statistics statistics = new Statistics();
        GameResult resultWinner = new GameResult(board.calculateWinner(), "win");
        GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
        statistics.addResult(resultWinner);
        statistics.addResult(resultLoser);
        System.out.println();
        System.out.println(statistics);
        System.out.println();
        statistics.showWinners(playerX, playerO);
        statistics.showLosses(playerX,playerO);
    }

    public static void play(Board board, Player playerX, Player playerO){
        System.out.println("Player " + board.currentPlayer + " moves...");
        System.out.print("Enter your move: ");
        //String move = console.next();
        if (!board.makeMove()) {
            System.out.println("Input was incorrect. Repeat your move.");
        }

        board.printBoard();
    }

    public  static Board createBoard(Player playerX, Player playerO){
        Board board = new Board(playerX, playerO);
        board.printBoard();
        return board;
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input = console.next();

        while (!input.equals("exit")) {

            System.out.println("Game started...");

            Player playerX = new Human("Litvinenko", "Ira", 'X');
            Player playerO = new AI("HP", "350G2", 'O');

            Board board = createBoard(playerX, playerO);

            while (!board.gameFinished()) {
                play(board, playerX, playerO);
            }

            System.out.println("The winner is " + board.calculateWinner());
            System.out.println();

            showStatistics(board, playerX, playerO);

            input = console.next();

        }
    }
}
