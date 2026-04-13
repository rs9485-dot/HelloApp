import java.util.Scanner;

public class StringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // keeps accessing
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index is out of bounds
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println("Length (charAt): " + len1);
        System.out.println("Length (built-in): " + len2);
    }
}