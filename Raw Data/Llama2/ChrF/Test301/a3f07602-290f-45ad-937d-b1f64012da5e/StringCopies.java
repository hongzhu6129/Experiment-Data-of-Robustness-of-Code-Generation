public class StringCopies {

    public static void main(String[] args) {
        String originalString = "Hello"; // Example string

        if (originalString.length() < 3) {
            System.out.println("The original string must be 3 or more characters long.");
        } else {
            String lastThreeChars = originalString.substring(originalString.length() - 3);
            String repeatedString = lastThreeChars.repeat(4); 
            System.out.println(repeatedString);
        }

        // More test cases:
        testAndPrint("Programming");
        testAndPrint("Java");
        testAndPrint("ab"); // Should print error message

    }


    // Helper function to encapsulate the logic and avoid repeating code
    public static void testAndPrint(String str) {
        if (str.length() < 3) {
            System.out.println("The original string \"" + str + "\" must be 3 or more characters long.");
        } else {
            String lastThreeChars = str.substring(str.length() - 3);
            String repeatedString = lastThreeChars.repeat(4);
            System.out.println(repeatedString);
        }
    }
}
