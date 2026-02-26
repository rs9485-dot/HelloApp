import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Calculating bonus
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }

        // Printing the bonus
        System.out.println("The bonus amount is: " + bonus);
    }
}