public class HelloApp {

    public static void main(String[] args) {

        // Create a String array to store 7 lines of banner
        String[] lines = new String[7];

        // Populate banner lines (O O P S pattern)
        lines[0] = String.join("   ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join("   ", "*   *", "*   *", "*     ", "*     ");
        lines[2] = String.join("   ", "*   *", "*   *", "*     ", "*     ");
        lines[3] = String.join("   ", "*   *", "*   *", "***** ", "***** ");
        lines[4] = String.join("   ", "*   *", "*   *", "*     ", "     *");
        lines[5] = String.join("   ", "*   *", "*   *", "*     ", "     *");
        lines[6] = String.join("   ", " *** ", " *** ", "*     ", "***** ");

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
