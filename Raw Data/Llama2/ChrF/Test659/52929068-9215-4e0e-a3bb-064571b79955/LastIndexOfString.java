public class LastIndexOfString {

    public static void main(String[] args) {
        String mainString = "This is a test string. This is another test.";
        String subString = "test";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


        // Another example with overlapping occurrences
        mainString = "abababa";
        subString = "aba";
        lastIndex = mainString.lastIndexOf(subString);
         if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }

        //Example with empty substring
        mainString = "abababa";
        subString = "";
        lastIndex = mainString.lastIndexOf(subString);
         if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


    }
}
