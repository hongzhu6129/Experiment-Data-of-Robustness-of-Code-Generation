public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Handle null inputs gracefully
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original String: " + mainString1);
        System.out.println("Remove String: " + removeString1);
        System.out.println("Result: " + result1);  // Output: Th a test string.


        String mainString2 = "abababa";
        String removeString2 = "aba";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("\nOriginal String: " + mainString2);
        System.out.println("Remove String: " + removeString2);
        System.out.println("Result: " + result2); // Output: b

        String mainString3 = "Hello World";
        String removeString3 = "xyz"; // String not present
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("\nOriginal String: " + mainString3);
        System.out.println("Remove String: " + removeString3);
        System.out.println("Result: " + result3); // Output: Hello World



        // Test null input handling
        String mainString4 = null;
        String removeString4 = "test";
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("\nOriginal String: " + mainString4);
        System.out.println("Remove String: " + removeString4);
        System.out.println("Result: " + result4); // Output: null

        String mainString5 = "test";
        String removeString5 = null;
        String result5 = remover.removeString(mainString5, removeString5);
        System.out.println("\nOriginal String: " + mainString5);
        System.out.println("Remove String: " + removeString5);
        System.out.println("Result: " + result5); // Output: test


    }
}
