public class TicTacToe1 {
    public static void main(String[] args) {

        // 1. Create a 3x3 board
        char[][] board = new char[3][3];

        // 2. Initialize board with '-'
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }

        // 3. Print the board
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }
}