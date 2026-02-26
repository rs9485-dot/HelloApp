import java.util.Scanner;

class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Checking if first number is the smallest
        boolean result = (number1 < number2) && (number1 < number3);

        // Printing result
        System.out.println("Is the first number the smallest? " + result);
    }
}