public class StringIndex {

    public static void main(String[] args) {
        String mainString = "This is a test string.";
        String subString = "is";

        int index = mainString.indexOf(subString);

        if (index != -1) {
            System.out.println("The earlier index of \"" + subString + "\" is: " + index);
        } else {
            System.out.println("\"" + subString + "\" is not found in the main string.");
        }


        // Additional examples:
        mainString = "abababa";
        subString = "aba";
        index = mainString.indexOf(subString);
        if (index != -1) {
            System.out.println("The earlier index of \"" + subString + "\" is: " + index);
        } else {
            System.out.println("\"" + subString + "\" is not found in the main string.");
        }


        mainString = "abababa";
        subString = "z";
        index = mainString.indexOf(subString);
        if (index != -1) {
            System.out.println("The earlier index of \"" + subString + "\" is: " + index);
        } else {
            System.out.println("\"" + subString + "\" is not found in the main string.");
        }

    }
}
