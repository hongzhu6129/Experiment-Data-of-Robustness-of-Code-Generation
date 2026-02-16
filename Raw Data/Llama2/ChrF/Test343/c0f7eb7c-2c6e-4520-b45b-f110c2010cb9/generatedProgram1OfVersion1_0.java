public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or throw an exception, depending on desired behavior
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original String: " + mainString1);
        System.out.println("String to remove: " + removeString1);
        System.out.println("Result: " + result1); // Output: Th a test string.


        String mainString2 = "abcabcabc";
        String removeString2 = "abc";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("\nOriginal String: " + mainString2);
        System.out.println("String to remove: " + removeString2);
        System.out.println("Result: " + result2);  // Output: "" (empty string)


        String mainString3 = "Hello World";
        String removeString3 = "xyz"; // Not present in mainString
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("\nOriginal String: " + mainString3);
        System.out.println("String to remove: " + removeString3);
        System.out.println("Result: " + result3); // Output: Hello World (no change)

        // Test null cases:
        System.out.println("\nTesting null cases:");
        System.out.println(remover.removeString(null, "test")); // Output: null (or handle as needed)
        System.out.println(remover.removeString("test", null)); // Output: test (or handle as needed)
        System.out.println(remover.removeString(null, null));    // Output: null (or handle as needed)




    }
}
