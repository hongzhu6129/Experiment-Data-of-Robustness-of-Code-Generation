public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "ses";
        String str3 = "abc";

        // Using endsWith() method
        boolean endsWithStr2 = str1.endsWith(str2);
        boolean endsWithStr3 = str1.endsWith(str3);

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWithStr3);


        // Demonstration without endsWith() -  for learning purposes
        //  (Less efficient, but shows the logic)

        String str4 = "Hello World";
        String str5 = "World";
        String str6 = "Java";

        boolean endsWithStr5 = checkEndsWith(str4, str5);
        boolean endsWithStr6 = checkEndsWith(str4, str6);

        System.out.println("\"" + str4 + "\" ends with \"" + str5 + "\"? " + endsWithStr5);
        System.out.println("\"" + str4 + "\" ends with \"" + str6 + "\"? " + endsWithStr6);

    }


    // Manual implementation of endsWith logic (for demonstration)
    public static boolean checkEndsWith(String mainString, String suffix) {
        if (suffix.length() > mainString.length()) {
            return false;
        }

        int mainLen = mainString.length();
        int suffixLen = suffix.length();

        for (int i = 0; i < suffixLen; i++) {
            if (mainString.charAt(mainLen - suffixLen + i) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
