public class LastIndexOfString {

    public static void main(String[] args) {
        String mainString = "This is a test string. test"; // Example string
        String subString = "test"; // Substring to search for

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


        // More examples for demonstration:
        mainString = "Hello World World";
        subString = "World";
        lastIndex = mainString.lastIndexOf(subString);
        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }



        mainString = "abababa";
        subString = "aba";
        lastIndex = mainString.lastIndexOf(subString);
        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }



        mainString = "Can you can a can as a canner can can a can?";
        subString = "can";
        lastIndex = mainString.lastIndexOf(subString);
        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


    }
}
