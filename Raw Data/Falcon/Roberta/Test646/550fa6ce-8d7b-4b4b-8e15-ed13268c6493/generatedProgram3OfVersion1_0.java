public class CubeCheckerWithInput {
    public static void main(String[] args) {
        if (args.length > 0) { // Check if an argument is provided
            try {
                int number = Integer.parseInt(args[0]);
                // ... (rest of the cube checking logic from the first example) ...

            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter an integer.");
            }
        } else {
            System.err.println("Please provide a number as a command-line argument.");
        }
    }
}
