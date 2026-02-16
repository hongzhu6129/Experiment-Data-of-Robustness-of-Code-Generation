public class StringComparison {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        // Method 1: Using compareTo()
        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);

        System.out.println("\"" + str1 + "\" compared to \"" + str2 + "\" (compareTo()): " + result1); // Output: -1 (str1 is lexicographically less than str2)
        System.out.println("\"" + str1 + "\" compared to \"" + str3 + "\" (compareTo()): " + result2); // Output: 0 (str1 is lexicographically equal to str3)


        // Method 2: Using equals() for lexicographical equality
        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\": " + isEqual1); // Output: false
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\": " + isEqual2); // Output: true


        // Method 3:  Illustrating case sensitivity
        String str4 = "Apple";
        int result3 = str1.compareTo(str4);  // 'a' > 'A' in ASCII
        boolean isEqual3 = str1.equalsIgnoreCase(str4); // Case-insensitive comparison


        System.out.println("\"" + str1 + "\" compared to \"" + str4 + "\" (compareTo()): " + result3);  // a positive value (str1 is lexicographically greater than str4)
        System.out.println("\"" + str1 + "\" equalsIgnoreCase \"" + str4 + "\": " + isEqual3); // Output: true



        // Example with command line arguments (if provided)
        if (args.length >= 2) {
            int resultArgs = args[0].compareTo(args[1]);
            System.out.println("\"" + args[0] + "\" compared to \"" + args[1] + "\" (compareTo() - args): " + resultArgs);
        } else {
            System.out.println("Provide two string arguments to compare from the command line.");
        }


    }
}
