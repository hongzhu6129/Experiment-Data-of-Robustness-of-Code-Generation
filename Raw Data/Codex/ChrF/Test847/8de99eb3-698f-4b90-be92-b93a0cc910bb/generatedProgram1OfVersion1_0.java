public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Handle null inputs gracefully
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "applebananaappleorange";
        String removeString1 = "apple";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Result 1: " + result1); // Output: banananaorange


        String mainString2 = "hello world hello";
        String removeString2 = "hello";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Result 2: " + result2);  // Output:  world 

        String mainString3 = null; // Test null input
        String removeString3 = "test";
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Result 3: " + result3); // Output: null

        String mainString4 = "test"; 
        String removeString4 = null; // Test null input
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Result 4: " + result4); // Output: test
    }
}
