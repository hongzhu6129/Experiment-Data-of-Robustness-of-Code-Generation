public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or throw an exception, depending on desired behavior
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring rs = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = rs.removeString(mainString1, removeString1);
        System.out.println("Original: " + mainString1);
        System.out.println("Removed \"" + removeString1 + "\": " + result1);


        String mainString2 = "abababa";
        String removeString2 = "aba";
        String result2 = rs.removeString(mainString2, removeString2);
        System.out.println("\nOriginal: " + mainString2);
        System.out.println("Removed \"" + removeString2 + "\": " + result2);


        String mainString3 = "Hello world!";
        String removeString3 = "xyz"; // Substring not present
        String result3 = rs.removeString(mainString3, removeString3);
        System.out.println("\nOriginal: " + mainString3);
        System.out.println("Removed \"" + removeString3 + "\": " + result3);

        //Test null cases
        System.out.println("\nTesting null handling:");
        System.out.println("Null main string: " + rs.removeString(null, "test"));
        System.out.println("Null remove string: " + rs.removeString("test", null));
        System.out.println("Both null: " + rs.removeString(null, null));
        


    }
}
