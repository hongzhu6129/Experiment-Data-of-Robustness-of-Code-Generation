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



        // Demonstrating without endsWith() - for educational purposes
        String str4 = "This is a test string";
        String str5 = "string";
        boolean endsWithStr5 = checkEndsWith(str4, str5);
        System.out.println("\"" + str4 + "\" ends with \"" + str5 + "\"? " + endsWithStr5);


         String str6 = "This is a test string";
        String str7 = "String"; // Case sensitive check
        boolean endsWithStr7 = checkEndsWith(str6, str7);
        System.out.println("\"" + str6 + "\" ends with \"" + str7 + "\"? " + endsWithStr7);




    }

    // Implementation without using endsWith() - for understanding
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
