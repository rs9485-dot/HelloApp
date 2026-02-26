import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Printing result
        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");
    }
}