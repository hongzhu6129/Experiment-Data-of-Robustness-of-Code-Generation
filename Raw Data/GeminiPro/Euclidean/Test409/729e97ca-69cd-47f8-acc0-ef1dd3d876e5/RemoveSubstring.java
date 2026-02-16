public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle null as needed (e.g., return null, throw exception)
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original: \"" + mainString1 + "\"");
        System.out.println("Removed \"" + removeString1 + "\": \"" + result1 + "\"");

        String mainString2 = "abababa";
        String removeString2 = "ab";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Original: \"" + mainString2 + "\"");
        System.out.println("Removed \"" + removeString2 + "\": \"" + result2 + "\"");


        String mainString3 = null; // Test null handling
        String removeString3 = "test";
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Original: \"" + mainString3 + "\"");
        System.out.println("Removed \"" + removeString3 + "\": \"" + result3 + "\"");



        String mainString4 = "Hello";
        String removeString4 = null; // Test null handling
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Original: \"" + mainString4 + "\"");
        System.out.println("Removed \"" + removeString4 + "\": \"" + result4 + "\"");
    }
}
