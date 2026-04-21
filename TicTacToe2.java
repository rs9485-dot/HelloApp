import java.util.Random;

public class TicTacToe2 {

    public static void main(String[] args) {

        // 1. Create Random object
        Random rand = new Random();

        // 2. Generate random number (0 or 1)
        int toss = rand.nextInt(2);

        // 3. Game state variables
        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // 4. Conditional logic based on toss
        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        // 5. Display results
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " starts first!");

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}