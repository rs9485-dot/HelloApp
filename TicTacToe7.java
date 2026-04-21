import java.util.Random;

public class TicTacToe7 {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};

    public static void computerMove() {
        Random rand = new Random();
        int move;

        while (true) {
            // Generate random number between 1–9
            move = rand.nextInt(9) + 1;

            // Convert to index (0–8)
            int index = move - 1;

            // Check if slot is valid (not already taken)
            if (board[index] != 'X' && board[index] != 'O') {
                board[index] = 'O'; // Computer plays 'O'
                System.out.println("Computer chose position: " + move);
                break;
            }
        }
    }

    // Method to display board
    public static void displayBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static void main(String[] args) {
        displayBoard();
        computerMove();
        displayBoard();
    }
}