public class UppercaseConverter {

    public static void main(String[] args) {
        String inputString = "Hello, World!"; // Example input string

        String uppercaseString = inputString.toUpperCase();

        System.out.println("Original string: " + inputString);
        System.out.println("Uppercase string: " + uppercaseString);


        // Handling null or empty input:
        String nullString = null;
        String emptyString = "";

        // Using a ternary operator for concise null checking
        String uppercaseNull = (nullString == null) ? null : nullString.toUpperCase();
        String uppercaseEmpty = (emptyString == null) ? null : emptyString.toUpperCase(); // Although empty strings won't change


        System.out.println("Null string uppercase: " + uppercaseNull);
        System.out.println("Empty string uppercase: " + uppercaseEmpty);


        // Handling user input:
        if (args.length > 0) {  // Check if any command-line arguments are provided
            String userString = args[0]; // Use the first argument
            String uppercaseUser = userString.toUpperCase();
            System.out.println("User input string (uppercase): " + uppercaseUser);

        } else {
            System.out.println("No command-line arguments provided.");
        }


    }
}
