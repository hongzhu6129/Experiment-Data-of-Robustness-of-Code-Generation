public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls as you see fit
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        RemoveSubstring remover = new RemoveSubstring();

        String mainString1 = "applebananappleorange";
        String removeString1 = "apple";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Result 1: " + result1); // Output: bananorange

        String mainString2 = "hello world hello";
        String removeString2 = "hello";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Result 2: " + result2); // Output:  world 

        String mainString3 = "test";
        String removeString3 = "test1";
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Result 3: " + result3); // Output: test


        String mainString4 = null; // Testing null handling
        String removeString4 = "test";
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Result 4: " + result4); // Output: null (or your chosen null handling)

         String mainString5 = "test"; // Testing null handling
        String removeString5 = null;
        String result5 = remover.removeString(mainString5, removeString5);
        System.out.println("Result 5: " + result5); // Output: test (or your chosen null handling)
    }
}
