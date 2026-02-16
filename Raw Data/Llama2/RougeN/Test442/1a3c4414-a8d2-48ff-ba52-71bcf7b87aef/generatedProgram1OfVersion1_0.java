public class StringConcatenation {

    public static void main(String[] args) {

        String str1 = "Hello"; // First string
        String str2 = " World!"; // Second string

        // Method 1: Using the + operator
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + concatenatedString1);


        // Method 2: Using concat() method
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string (using concat()): " + concatenatedString2);


        // Example with user input (for demonstration only - not required by problem)
        // In a real application, handle potential exceptions (e.g., NullPointerException)

        if (args.length >= 2) {  // Check if at least two command-line arguments are provided
            String userStr1 = args[0];
            String userStr2 = args[1];
            String concatenatedUserString = userStr1.concat(userStr2);
            System.out.println("Concatenated user-provided strings: " + concatenatedUserString);
        } else {
            System.out.println("Please provide two strings as command-line arguments.");
        }

    }
}
