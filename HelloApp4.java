public class HelloApp4{

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                // Add comma except for last element
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            System.out.println("Hello, " + names.toString() + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}