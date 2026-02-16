public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls as you see fit (e.g., throw an exception)
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original: " + mainString1);
        System.out.println("Removed \"" + removeString1 + "\": " + result1); // Output: Th a test string.


        String mainString2 = "abababa";
        String removeString2 = "aba";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Original: " + mainString2);
        System.out.println("Removed \"" + removeString2 + "\": " + result2);  // Output: b

        String mainString3 = "Hello World";
        String removeString3 = "xyz"; // String not found
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Original: " + mainString3);
        System.out.println("Removed \"" + removeString3 + "\": " + result3);  // Output: Hello World


        // Test null handling (important!)
        String mainString4 = null;
        String removeString4 = "test";
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Original: " + mainString4);
        System.out.println("Removed \"" + removeString4 + "\": " + result4); // Output: null (based on current handling)


    }
}
