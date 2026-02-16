public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null || removeString.isEmpty()) {
            return mainString; 
        }

        int index = mainString.indexOf(removeString);
        int removeLength = removeString.length();

        while (index != -1) {
            mainString = mainString.substring(0, index) + mainString.substring(index + removeLength);
            index = mainString.indexOf(removeString);
        }

        return mainString;
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original: \"" + mainString1 + "\"");
        System.out.println("Removed \"" + removeString1 + "\": \"" + result1 + "\"");


        String mainString2 = "HelloHelloHello World";
        String removeString2 = "Hello";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Original: \"" + mainString2 + "\"");
        System.out.println("Removed \"" + removeString2 + "\": \"" + result2 + "\"");

        String mainString3 = "abababa";
        String removeString3 = "aba";
        String result3 = remover.removeString(mainString3,"aba");
        System.out.println("Original: \"" + mainString3 + "\"");
        System.out.println("Removed \"" + removeString3 + "\": \"" + result3 + "\"");

        // Test null and empty cases:
        System.out.println(remover.removeString(null, "test")); // Returns null
        System.out.println(remover.removeString("test", null));  // Returns "test"
        System.out.println(remover.removeString("test", ""));   // Returns "test"
        System.out.println(remover.removeString("", "test")); // Returns ""

    }
}
