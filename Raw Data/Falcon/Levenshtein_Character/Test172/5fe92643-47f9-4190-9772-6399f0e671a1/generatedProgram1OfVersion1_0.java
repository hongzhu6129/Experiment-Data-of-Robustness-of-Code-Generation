public class UppercaseConverter {

    public static void main(String[] args) {
        // Input string
        String inputString = "Hello World! 123"; // Example input

        // Convert to uppercase
        String uppercaseString = inputString.toUpperCase();

        // Print the result
        System.out.println("Original string: " + inputString);
        System.out.println("Uppercase string: " + uppercaseString);


        // Handling command-line arguments (if any)
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("Uppercase of \"" + arg + "\": " + arg.toUpperCase());
            }
        }
    }
}
