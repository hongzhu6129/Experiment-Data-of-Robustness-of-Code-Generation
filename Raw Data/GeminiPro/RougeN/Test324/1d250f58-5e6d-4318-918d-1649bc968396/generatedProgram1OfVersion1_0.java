public class StringConcatenation {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = " World";

        // Method 1: Using the + operator
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + concatenatedString1);

        // Method 2: Using the concat() method
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string (using concat()): " + concatenatedString2);


        // Example with user-provided strings (if you run from command line)
        if (args.length == 2) {
            String arg1 = args[0];
            String arg2 = args[1];
            String concatenatedArgs = arg1.concat(arg2);
            System.out.println("Concatenated command-line arguments: " + concatenatedArgs);
        } else if (args.length > 0) {
            System.out.println("Please provide exactly two strings as command-line arguments.");
        }

    }
}
