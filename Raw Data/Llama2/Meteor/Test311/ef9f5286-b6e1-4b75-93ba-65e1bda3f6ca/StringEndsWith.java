public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";

        // Using endsWith() method
        boolean endsWithStr2 = str1.endsWith(str2);
        boolean endsWithStr3 = str1.endsWith(str3);

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWithStr3);


        // Demonstrating a manual check (without using endsWith()) - for educational purposes
        if (args.length == 2) {  // Accept two strings from command-line arguments
            String inputString = args[0];
            String suffix = args[1];

            boolean manualCheck = checkEndsWith(inputString, suffix);
            System.out.println("\"" + inputString + "\" ends with \"" + suffix + "\" (manual check)? " + manualCheck);

        } else {
            System.out.println("Please provide two string arguments.");
        }
    }

    // Manual implementation of endsWith (for demonstration only)
    private static boolean checkEndsWith(String str, String suffix) {
        if (suffix.length() > str.length()) {
            return false;
        }

        int strLength = str.length();
        int suffixLength = suffix.length();

        for (int i = 0; i < suffixLength; i++) {
            if (str.charAt(strLength - suffixLength + i) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

