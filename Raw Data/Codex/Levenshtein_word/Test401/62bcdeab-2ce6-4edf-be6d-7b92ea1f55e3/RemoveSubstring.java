public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Handle null inputs gracefully
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring rs = new RemoveSubstring();

        String mainString1 = "This is a test string however however.";
        String removeString1 = "however";
        String result1 = rs.removeString(mainString1, removeString1);
        System.out.println("Result 1: \"" + result1 + "\""); // Output: This is a test string .

        String mainString2 = "No occurrences to remove";
        String removeString2 = "xyz";
        String result2 = rs.removeString(mainString2, removeString2);
        System.out.println("Result 2: \"" + result2 + "\""); // Output: No occurrences to remove

        String mainString3 = null; // Test null input
        String removeString3 = "abc";
        String result3 = rs.removeString(mainString3, removeString3);
        System.out.println("Result 3: \"" + result3 + "\""); // Output: null


        String mainString4 = "Test overlapping occurrences abcabc";
        String removeString4 = "abc";
        String result4 = rs.removeString(mainString4, removeString4);
        System.out.println("Result 4: \"" + result4 + "\""); // Output: Test overlapping occurrences 


        String mainString5 = "abababa";
        String removeString5 = "aba";
        String result5 = rs.removeString(mainString5, removeString5); // Demonstrates correct handling of overlaps
        System.out.println("Result 5: \"" + result5 + "\""); // Output: b

    }
}
