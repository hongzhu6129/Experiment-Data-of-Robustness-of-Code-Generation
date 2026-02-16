public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null || removeString.isEmpty()) {
            return mainString; 
        }

        while (mainString.contains(removeString)) {
            int index = mainString.indexOf(removeString);
            mainString = mainString.substring(0, index) + mainString.substring(index + removeString.length());
        }
        return mainString;
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "This is a test string.";
        String removeString1 = "is";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Original String: " + mainString1);
        System.out.println("String to remove: " + removeString1);
        System.out.println("Result: " + result1); // Output: Th a test string.


        String mainString2 = "abababa";
        String removeString2 = "aba";
        String result2 = remover.removeString(mainString2,"aba");
        System.out.println("\nOriginal String: " + mainString2);
        System.out.println("String to remove: " + removeString2);
        System.out.println("Result: " + result2);  // Output: "" (empty string)


        String mainString3 = "Hello world, world!";
        String removeString3 = "world";
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("\nOriginal String: " + mainString3);
        System.out.println("String to remove: " + removeString3);
        System.out.println("Result: " + result3); // Output: Hello , !



         String mainString4 = "Coding is fun, coding is great";
        String removeString4 = "coding"; // Case-sensitive
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("\nOriginal String: " + mainString4);
        System.out.println("String to remove: " + removeString4);
        System.out.println("Result: " + result4); // Output: Coding is fun,  is great (Only lowercase removed)

         String mainString5 = null; 
        String removeString5 = "test"; 
        String result5 = remover.removeString(mainString5, removeString5);
        System.out.println("\nOriginal String: " + mainString5);
        System.out.println("String to remove: " + removeString5);
        System.out.println("Result: " + result5); //Output: null


    }
}
