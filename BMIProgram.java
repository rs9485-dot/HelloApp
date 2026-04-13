import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display in tabular format
    public static void display(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" +
                               data[i][1] + "\t\t" +
                               data[i][2] + "\t\t" +
                               data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        // Input: weight & height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            input[i][0] = sc.nextDouble(); // weight
            input[i][1] = sc.nextDouble(); // height
        }

        // Calculate BMI
        String[][] result = calculateBMI(input);

        // Display
        display(result);
    }
}