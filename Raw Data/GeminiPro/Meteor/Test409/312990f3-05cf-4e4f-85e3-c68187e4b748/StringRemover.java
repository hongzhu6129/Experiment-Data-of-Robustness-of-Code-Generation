public class StringRemover {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or throw an exception, depending on desired behavior
        }

        return mainString.replace(removeString, "");
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "applebananabananaorange";
        String removeString1 = "banana";
        String result1 = remover.removeString(mainString1, removeString1);
        System.out.println("Result 1: " + result1); // Output: appleorange

        String mainString2 = "hello world hello";
        String removeString2 = "hello";
        String result2 = remover.removeString(mainString2, removeString2);
        System.out.println("Result 2: " + result2); // Output:  world 

        String mainString3 = "test";
        String removeString3 = "testtest"; // Removing a string that doesn't exist
        String result3 = remover.removeString(mainString3, removeString3);
        System.out.println("Result 3: " + result3); // Output: test


        String mainString4 = null;         // Test with null main string
        String removeString4 = "test";
        String result4 = remover.removeString(mainString4, removeString4);
        System.out.println("Result 4: " + result4); // Output: null (or handle as needed)



        String mainString5 = "test";
        String removeString5 = null;         // Test with null remove string
        String result5 = remover.removeString(mainString5, removeString5);
        System.out.println("Result 5: " + result5); // Output: test (or handle as needed)


    }
}
