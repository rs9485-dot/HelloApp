import java.util.Random;

public class FootballHeights {

    // Method to find sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        // Display heights
        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Results
        System.out.println("\nSum: " + findSum(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}