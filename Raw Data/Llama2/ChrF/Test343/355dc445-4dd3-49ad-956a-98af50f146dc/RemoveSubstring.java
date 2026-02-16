public class RemoveSubstring {

    public String removeString(String mainString, String removeString) {
        if (mainString == null || removeString == null) {
            return mainString; // Or handle null as needed, e.g., return null or throw exception
        }

        return mainString.replace(removeString, ""); 
    }

    public static void main(String[] args) {
        RemoveSubstring rs = new RemoveSubstring();

        String mainString1 = "This is a test string however however";
        String removeString1 = "however";
        String result1 = rs.removeString(mainString1, removeString1);
        System.out.println("Result 1: \"" + result1 + "\"");  // Output: Result 1: "This is a test string  "


        String mainString2 = "No removals here";
        String removeString2 = "xyz";
        String result2 = rs.removeString(mainString2, removeString2);
        System.out.println("Result 2: \"" + result2 + "\""); // Output: Result 2: "No removals here"


        String mainString3 = null;
        String removeString3 = "abc";
        String result3 = rs.removeString(mainString3, removeString3);
        System.out.println("Result 3: \"" + result3 + "\""); // Output: Result 3: "null"


        String mainString4 = "abababa";
        String removeString4 = "aba";
        String result4 = rs.removeString(mainString4,"aba");
        System.out.println("Result 4: \""+ result4 + "\""); //Output: Result 4: ""


        
        String mainString5 = "aabbaabbaa";
        String removeString5 = "aa";
        String result5 = rs.removeString(mainString5,removeString5);
        System.out.println("Result 5: \"" + result5 + "\""); //Output: Result 5: "bb bb"


    }
}
