public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if a command-line argument is provided
        if (args.length > 0) {
            name = args[0];
        }

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}
