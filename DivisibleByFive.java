import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking divisibility
        boolean result = (number % 5 == 0);

        // Printing result
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}