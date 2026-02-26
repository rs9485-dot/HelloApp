import java.util.Scanner;

class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for valid Gregorian year
        if (year < 1582) {
            System.out.println("Year should be 1582 or later.");
        } else {
            // Multiple if-else checks
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}