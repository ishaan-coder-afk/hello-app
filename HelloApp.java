public class HelloApp {

    public static void main(String[] args) {

        String result;

        // Check if arguments are provided
        if (args.length > 0) {

            // Join all names with comma and space
            result = String.join(", ", args);

        } else {
            // Default value
            result = "World";
        }

        // Print greeting
        System.out.println("Hello, " + result + "!");
    }
}