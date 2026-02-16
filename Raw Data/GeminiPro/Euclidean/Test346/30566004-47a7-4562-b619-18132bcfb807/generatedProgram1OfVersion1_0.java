public class LowercaseConverter {

    public static void main(String[] args) {
        // Example usage:
        String inputString = "HeLlO, wOrLd!";
        String lowercaseString = inputString.toLowerCase();

        System.out.println("Original string: " + inputString);
        System.out.println("Lowercase string: " + lowercaseString);


        // Handling command-line arguments (if provided)
        if (args.length > 0) {
            for (String arg : args) {
                 lowercaseString = arg.toLowerCase();
                System.out.println("Lowercase: " + lowercaseString);
            }
        } 
    }
}
