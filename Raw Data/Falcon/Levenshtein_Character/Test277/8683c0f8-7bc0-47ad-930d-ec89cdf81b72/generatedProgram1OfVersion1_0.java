public class LastIndexOfString {

    public static void main(String[] args) {
        String mainString = "This is a test string. This is a test.";
        String subString = "is";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


        // Another example with a string that appears only once:
        mainString = "This is a test string.";
        subString = "test";

        lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }


        // And an example where the substring isn't present:
         mainString = "This is a test string.";
        subString = "xyz";

        lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }
    }
}
