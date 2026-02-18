public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Handle null inputs gracefully
        }
        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        // Test cases
        String main1 = "hello world hello";
        String remove1 = "hello";
        String result1 = remover.removeString(main1, remove1);
        System.out.println("Result 1: \"" + result1 + "\"");  // Output: " world "

        String main2 = "abcabcabc";
        String remove2 = "abc";
        String result2 = remover.removeString(main2, remove2);
        System.out.println("Result 2: \"" + result2 + "\""); // Output: ""

        String main3 = "This is a test string.";
        String remove3 = "is";
        String result3 = remover.removeString(main3, remove3);
        System.out.println("Result 3: \"" + result3 + "\""); // Output: "Th  a test string."


        String main4 = null;  // Test null input
        String remove4 = "test";
        String result4 = remover.removeString(main4, remove4);
        System.out.println("Result 4: \"" + result4 + "\""); // Output: null

        String main5 = "test"; // Test null input
        String remove5 = null;
        String result5 = remover.removeString(main5, remove5);
        System.out.println("Result 5: \"" + result5 + "\""); // Output: "test"

        String main6 = "apple banana apple apple"; // Test multiple occurrences
        String remove6 = "apple";
        String result6 = remover.removeString(main6, remove6);
        System.out.println("Result 6: \"" + result6 + "\""); // Output: " banana  "


    }
}
