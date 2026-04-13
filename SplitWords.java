import java.util.Scanner;

public class SplitWords {

    // method to find length (reuse logic)
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // count words
    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // split using charAt
    public static String[] splitUsingCharAt(String str) {
        int len = findLength(str);
        int words = countWords(str);

        int[] spaceIndex = new int[words - 1];
        int k = 0;

        // store space indexes
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] result = new String[words];

        int start = 0;

        for (int i = 0; i < words; i++) {
            int end = (i < words - 1) ? spaceIndex[i] : len;

            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }

            result[i] = word;
            start = end + 1;
        }

        return result;
    }

    // compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] arr1 = splitUsingCharAt(text);
        String[] arr2 = text.split(" ");

        boolean result = compareArrays(arr1, arr2);

        System.out.println("Are both splits equal: " + result);
    }
}