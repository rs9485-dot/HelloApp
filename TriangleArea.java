import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input (in cm)
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        // 1 inch = 2.54 cm
        // 1 sq inch = 2.54 * 2.54 = 6.4516 sq cm
        double areaInch = areaCm / 6.4516;

        // Printing results
        System.out.println("The Area of the triangle in sq in is " 
                + areaInch + " and sq cm is " + areaCm);
    }
}