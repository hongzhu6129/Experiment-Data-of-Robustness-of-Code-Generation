public class LastIndexPart {

    public static void main(String[] args) {
        String mainString = "This is a test string with a substring.";
        String subString = "string";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" in \"" + mainString + "\": " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in \"" + mainString + "\".");
        }


        // More examples:
        test("Hello world world", "world"); // Output: 12
        test("This is a test", "is"); // Output: 2
        test("abababa", "aba"); // Output: 4
        test("abcdefg", "xyz"); // Output: -1 (not found)
        test("aaaaaa", "aa"); // Output: 4


    }


    // Helper function for additional testing (within main)
    public static void test(String mainString, String subString) {
        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" in \"" + mainString + "\": " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in \"" + mainString + "\".");
        }
    }
}
