public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or throw an exception, depending on your requirements
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        RemoveSubstring rs = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = rs.removeString(mainString1, removeString1);
        System.out.println("Original: \"" + mainString1 + "\"");
        System.out.println("Removed \"" + removeString1 + "\": \"" + result1 + "\""); // Output: Th  a test string.


        String mainString2 = "abababa";
        String removeString2 = "aba";
        String result2 = rs.removeString(mainString2, removeString2);
        System.out.println("Original: \"" + mainString2 + "\"");
        System.out.println("Removed \"" + removeString2 + "\": \"" + result2 + "\"");  // Output: b

        String mainString3 = "Hello World!";
        String removeString3 = "xyz"; // Removing a string that doesn't exist
        String result3 = rs.removeString(mainString3, removeString3);
        System.out.println("Original: \"" + mainString3 + "\"");
        System.out.println("Removed \"" + removeString3 + "\": \"" + result3 + "\""); // Output: Hello World! (no change)

        // Test null/empty cases
        System.out.println(rs.removeString(null, "test")); // Output: null (or handle as needed)
        System.out.println(rs.removeString("test", null)); // Output: test  (or handle as needed)
        System.out.println(rs.removeString("test", "")); // Output: test
        System.out.println(rs.removeString("", "test")); // Output: ""



    }
}
