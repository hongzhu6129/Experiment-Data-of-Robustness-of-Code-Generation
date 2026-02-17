public class LastIndexOfString {

    public static void main(String[] args) {
        // Example usage:
        String mainString = "This is a test string. This is another test.";
        String subString = "test";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


        // More Examples:
        mainString = "abcabcabc";
        subString = "abc";
        System.out.println("Last index of \"" + subString + "\" is: " + mainString.lastIndexOf(subString)); // Output: 6

        mainString = "hello";
        subString = "world";
        System.out.println("Last index of \"" + subString + "\" is: " + mainString.lastIndexOf(subString)); // Output: -1 (not found)


         mainString = "aaaaa";
        subString = "aa";
        System.out.println("Last index of \"" + subString + "\" is: " + mainString.lastIndexOf(subString)); // Output: 3


        mainString = "This is a test string.";
        subString = ""; // Empty string
        System.out.println("Last index of \"" + subString + "\" is: " + mainString.lastIndexOf(subString)); // Output: 21 (end of string)
    }
}
