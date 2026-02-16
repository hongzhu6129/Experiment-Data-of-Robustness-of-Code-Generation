public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null || removeString.isEmpty()) {
            return mainString; 
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


        String mainString2 = "Hello world, world!";
        String removeString2 = "world";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("\nOriginal String: " + mainString2);
        System.out.println("String to remove: " + removeString2);
        System.out.println("Result: " + result2); // Output: Hello , !

        // Test with null and empty strings
        System.out.println("\nTesting with null and empty strings:");
        System.out.println(remover.removeString(null, "test")); // Output: null
        System.out.println(remover.removeString("test", null)); // Output: test
        System.out.println(remover.removeString("test", ""));   // Output: test



    }
}
