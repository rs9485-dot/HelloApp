import java.util.Scanner;

public class TicTacToe3 {

    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot; // return the entered value
    }

    public static void main(String[] args) {

        // Call the method
        int userSlot = getUserInput();

        // Display entered value (for testing)
        System.out.println("You selected slot: " + userSlot);
    }
}