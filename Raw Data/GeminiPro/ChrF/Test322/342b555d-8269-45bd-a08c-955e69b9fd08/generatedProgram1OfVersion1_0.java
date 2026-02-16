public class StringCompare {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "Hello"; // Different case

        // Using compareTo() method
        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);
        int result3 = str1.compareTo(str4);


        System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\":");
        if (result1 < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\"");
        } else if (result1 > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\"");
        }

        System.out.println("\nComparing \"" + str1 + "\" and \"" + str3 + "\":");
        if (result2 < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str3 + "\"");
        } else if (result2 > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str3 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str3 + "\"");
        }


        System.out.println("\nComparing \"" + str1 + "\" and \"" + str4 + "\":");
        if (result3 < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str4 + "\"");
        } else if (result3 > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str4 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str4 + "\"");
        }


        // Demonstrating equals() for exact equality (case-sensitive)
        System.out.println("\nUsing equals() for exact comparison:");
        System.out.println("\"" + str1 + "\".equals(\"" + str3 + "\"): " + str1.equals(str3));
        System.out.println("\"" + str1 + "\".equals(\"" + str4 + "\"): " + str1.equals(str4));  // Case-sensitive!

        // Demonstrating equalsIgnoreCase() for case-insensitive comparison
        System.out.println("\"" + str1 + "\".equalsIgnoreCase(\"" + str4 + "\"): " + str1.equalsIgnoreCase(str4)); //Case-insensitive



    }
}
