public class StringRemover {

    public String removeString(String whichString, String removeString) {
        if (whichString == null || removeString == null) {
            return whichString; // Or handle nulls as you deem appropriate
        }

        return whichString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String whichString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(whichString1, removeString1);
        System.out.println("Original String: " + whichString1);
        System.out.println("String to remove: " + removeString1);
        System.out.println("Result: " + result1); // Output: Th a test string.


        String whichString2 = "Hello world, world!";
        String removeString2 = "world";
        String result2 = remover.removeString(whichString2, removeString2);
        System.out.println("\nOriginal String: " + whichString2);
        System.out.println("String to remove: " + removeString2);
        System.out.println("Result: " + result2); // Output: Hello , !

        // Test null handling:
        String whichString3 = null;
        String removeString3 = "test";
        String result3 = remover.removeString(whichString3, removeString3);
        System.out.println("\nOriginal String: " + whichString3);
        System.out.println("String to remove: " + removeString3);
        System.out.println("Result: " + result3); // Output: null (or handle differently as needed)


    }
}
