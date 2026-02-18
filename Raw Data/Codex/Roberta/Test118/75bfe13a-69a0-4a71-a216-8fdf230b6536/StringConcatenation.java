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


        // Example with user-provided strings (if arguments are provided)
        if (args.length == 2) {
            String arg1 = args[0];
            String arg2 = args[1];
            String concatenatedArgs = arg1.concat(arg2);
            System.out.println("Concatenated arguments: " + concatenatedArgs);
        }


    }
}
