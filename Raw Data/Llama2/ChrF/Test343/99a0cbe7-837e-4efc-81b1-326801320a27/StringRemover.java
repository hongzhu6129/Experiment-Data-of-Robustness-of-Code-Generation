public class StringRemover {

    public String removeString(String mainString, String preventString) {
        if (mainString == null || preventString == null) {
            return mainString; // Or handle nulls differently as needed
        }

        return mainString.replace(preventString, "");
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "This is a test string.";
        String preventString1 = "is";
        String result1 = remover.removeString(mainString1, preventString1);
        System.out.println("Original String: " + mainString1);
        System.out.println("String to remove: " + preventString1);
        System.out.println("Result: " + result1); // Output: Th a test string.


        String mainString2 = "Hello world, hello world";
        String preventString2 = "world";
        String result2 = remover.removeString(mainString2, preventString2);
        System.out.println("\nOriginal String: " + mainString2);
        System.out.println("String to remove: " + preventString2);
        System.out.println("Result: " + result2); // Output: Hello , hello 

        String mainString3 = "abababa";
        String preventString3 = "ab";
        String result3 = remover.removeString(mainString3,"ab");
        System.out.println("\nOriginal String: " + mainString3);
        System.out.println("String to remove: " + preventString3);
        System.out.println("Result: " + result3); // Output: a

         String mainString4 = null; // Testing with null main string
        String preventString4 = "test";
        String result4 = remover.removeString(mainString4, preventString4);
        System.out.println("\nOriginal String: " + mainString4);
        System.out.println("String to remove: " + preventString4);
        System.out.println("Result: " + result4); // Output: null (or handle as needed)
    }
}

