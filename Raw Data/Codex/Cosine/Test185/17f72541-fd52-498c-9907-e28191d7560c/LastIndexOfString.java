public class LastIndexOfString {

    public static void main(String[] args) {

        // Example usage:
        String mainString = "This is a test string. string appears multiple times.";
        String subString = "string";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of '" + subString + "' is: " + lastIndex);
        } else {
            System.out.println("'" + subString + "' not found in the main string.");
        }


        //More Examples
        System.out.println("Last index of 'is': " + "This is a test string".lastIndexOf("is")); // Output: 5 (last occurrence of "is")
        System.out.println("Last index of 'Test': " + "This is a test string".lastIndexOf("Test")); // Output: -1 ("Test" with capital T is not found)
        System.out.println("Last index of '': " + "This is a test string".lastIndexOf("")); // Output: 22 (empty string is found at the very end)



    }
}
