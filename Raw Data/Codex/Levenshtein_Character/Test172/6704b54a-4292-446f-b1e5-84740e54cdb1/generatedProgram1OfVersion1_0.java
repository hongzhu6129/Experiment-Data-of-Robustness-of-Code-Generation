public class UppercaseConverter {

    public static void main(String[] args) {
        String inputString = "Hello, World!"; // Example string

        if (args.length > 0) { // Use command-line argument if provided
            inputString = args[0]; 
        }

        String uppercaseString = inputString.toUpperCase();

        System.out.println("Original string: " + inputString);
        System.out.println("Uppercase string: " + uppercaseString);
    }
}
