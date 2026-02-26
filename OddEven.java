import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number (1 or greater).");
            return;
        }

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
    }
}