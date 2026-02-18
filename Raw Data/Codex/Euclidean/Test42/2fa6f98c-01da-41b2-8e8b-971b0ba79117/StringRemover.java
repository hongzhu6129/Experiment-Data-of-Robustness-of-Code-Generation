public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or throw an exception, depending on desired behavior
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original: \"" + mainString1 + "\"");
        System.out.println("Removed \"" + removeString1 + "\": \"" + result1 + "\"");

        String mainString2 = "Hello World, Hello Java";
        String removeString2 = "Hello";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Original: \"" + mainString2 + "\"");
        System.out.println("Removed \"" + removeString2 + "\": \"" + result2 + "\"");


        // Test with null and empty strings
        System.out.println(remover.removeString(null, "test"));      // Output: null
        System.out.println(remover.removeString("test", null));      // Output: test
        System.out.println(remover.removeString("test", ""));       // Output: test
        System.out.println(remover.removeString("", "test"));       // Output: ""

    }
}
