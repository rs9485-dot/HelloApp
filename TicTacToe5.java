public class TicTacToe5 {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // 1. Boundary checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // 3. Move is valid
        return true;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}