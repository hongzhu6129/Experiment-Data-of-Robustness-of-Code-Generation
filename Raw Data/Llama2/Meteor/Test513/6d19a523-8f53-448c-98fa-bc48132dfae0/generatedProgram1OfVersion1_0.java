public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls as needed, maybe throw an exception
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainStr1 = "applebananaappleorange";
        String removeStr1 = "apple";
        String result1 = remover.removeString(mainStr1, removeStr1);
        System.out.println("Original String: " + mainStr1);
        System.out.println("String to remove: " + removeStr1);
        System.out.println("Result: " + result1);  // Output: banananaorange


        String mainStr2 = "hello world hello";
        String removeStr2 = "hello";
        String result2 = remover.removeString(mainStr2, removeStr2);
        System.out.println("\nOriginal String: " + mainStr2);
        System.out.println("String to remove: " + removeStr2);
        System.out.println("Result: " + result2); // Output:  world 

        // Test null and empty cases
        System.out.println("\nTesting null and empty strings:");
        System.out.println(remover.removeString(null, "test")); // Output: null (or handle as desired)
        System.out.println(remover.removeString("test", null)); // Output: test (or handle as desired)
        System.out.println(remover.removeString("test", ""));    // Output: test
        System.out.println(remover.removeString("", "test"));    // Output: ""



    }
}
