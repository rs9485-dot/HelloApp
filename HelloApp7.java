public class HelloApp7 {
    public static void main(String[] args) {

        String greeting;

        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        System.out.println(greeting);
    }
}