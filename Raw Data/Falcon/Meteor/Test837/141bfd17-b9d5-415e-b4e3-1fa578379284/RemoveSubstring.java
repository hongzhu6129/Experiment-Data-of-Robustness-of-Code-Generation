public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle nulls differently as per your requirement
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        RemoveSubstring rs = new RemoveSubstring();

        String mainString1 = "applebananaappleorange";
        String removeString1 = "apple";
        String result1 = rs.removeString(mainString1, removeString1);
        System.out.println("Result 1: " + result1); // Output: bananabananaorange


        String mainString2 = "This is a test string";
        String removeString2 = "is";
        String result2 = rs.removeString(mainString2, removeString2);
        System.out.println("Result 2: " + result2); // Output: Th  a test string

        String mainString3 =  "abababa";
        String removeString3 = "aba";
        String result3 = rs.removeString(mainString3,"aba");
        System.out.println("Result 3: " + result3); // Output: b

        String mainString4 = null;
        String removeString4 = "test";
        String result4 = rs.removeString(mainString4, removeString4); // Handling null mainString
        System.out.println("Result 4: " + result4); // Output: null (or your chosen null handling behavior)


        
    }
}
