public class StringConcatenation {

    public static void main(String[] args) {
        String str1 = "Hello"; // First string
        String str2 = " World!"; // Second string

        // Method 1: Using the + operator
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + concatenatedString1);

        // Method 2: Using the concat() method
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string (using concat()): " + concatenatedString2);

        // Example with user input (for demonstration, assuming args[0] and args[1] exist)
        if (args.length >= 2) {
            String userStr1 = args[0];
            String userStr2 = args[1];
            String userConcatenated = userStr1.concat(userStr2);
            System.out.println("Concatenated user input: " + userConcatenated);
        } else {
            System.out.println("Please provide two strings as command-line arguments.");
        }


        // More robust handling of command-line arguments:
        if (args.length >= 2) {
             String userStr1 = args[0];
            String userStr2 = args[1];
            String userConcatenated = userStr1 + userStr2; // Using + is simpler here
            System.out.println("Concatenated using command line args : " + userConcatenated);

        }
    }
}
