import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert number to string to count digits easily
        String numStr = Long.toString(number);

        int length = numStr.length();

        // Array to store digits
        int[] digits = new int[length];

        // Store digits in array
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Frequency array (0–9 digits)
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < length; i++) {
            frequency[digits[i]]++;
        }

        // Display result
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}