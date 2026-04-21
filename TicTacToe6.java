public class TicTacToe6 {

    // Method to place move on board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol; // update board
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Place move
        placeMove(board, row, col, symbol);

        // Print board to verify
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}