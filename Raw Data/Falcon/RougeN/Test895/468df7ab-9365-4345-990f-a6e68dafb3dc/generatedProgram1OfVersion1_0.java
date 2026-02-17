public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls as appropriate
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original string: \"" + mainString1 + "\"");
        System.out.println("Remove string: \"" + removeString1 + "\"");
        System.out.println("Result string: \"" + result1 + "\""); // Output: Th  a test string.

        String mainString2 = "Hello world, world!";
        String removeString2 = "world";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("\nOriginal string: \"" + mainString2 + "\"");
        System.out.println("Remove string: \"" + removeString2 + "\"");
        System.out.println("Result string: \"" + result2 + "\""); // Output: Hello , !


        String mainString3 = "abababa";
        String removeString3 = "aba";
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("\nOriginal string: \"" + mainString3 + "\"");
        System.out.println("Remove string: \"" + removeString3 + "\"");
        System.out.println("Result string: \"" + result3 + "\""); // Output: b



        // Test null and empty cases:
        System.out.println("\nTesting null and empty strings:");
        System.out.println(remover.removeString(null, "test")); // Output: null (or your specified handling)
        System.out.println(remover.removeString("test", null)); // Output: test (or your specified handling)
        System.out.println(remover.removeString("test", ""));   // Output: test
        System.out.println(remover.removeString("", "test"));   // Output: ""

    }
}
