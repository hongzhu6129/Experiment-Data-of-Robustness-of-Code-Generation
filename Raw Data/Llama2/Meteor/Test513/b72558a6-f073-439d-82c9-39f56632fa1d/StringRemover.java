public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls as you see fit
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


        String mainString2 = "Hello world, world!";
        String removeString2 = "world";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Original: \"" + mainString2 + "\"");
        System.out.println("Removed \"" + removeString2 + "\": \"" + result2 + "\"");

        String mainString3 = "abababa";
        String removeString3 = "aba";  // Demonstrates removing overlapping occurrences
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Original: \"" + mainString3 + "\"");
        System.out.println("Removed \"" + removeString3 + "\": \"" + result3 + "\"");

        String mainString4 = null; // test null
        String removeString4 = "world"; 
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Original: \"" + mainString4 + "\"");
        System.out.println("Removed \"" + removeString4 + "\": \"" + result4 + "\"");

        String mainString5 = "Hello"; // test null
        String removeString5 = null; 
        String result5 = remover.removeString(mainString5, removeString5);
        System.out.println("Original: \"" + mainString5 + "\"");
        System.out.println("Removed \"" + removeString5 + "\": \"" + result5 + "\"");



    }
}
