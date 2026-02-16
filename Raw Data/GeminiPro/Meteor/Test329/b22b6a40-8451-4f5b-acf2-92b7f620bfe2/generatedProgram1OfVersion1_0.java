public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";

        // Method 1: Using endsWith() method
        boolean endsWith1 = str1.endsWith(str2);
        boolean endsWith2 = str1.endsWith(str3);

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith1);  // Output: true
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWith2);  // Output: false


        // Method 2: Manual check (for demonstration, endsWith() is preferred)
        boolean manualCheck1 = checkEndsWith(str1, str2);
        boolean manualCheck2 = checkEndsWith(str1, str3);

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? (Manual Check) " + manualCheck1);  // Output: true
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? (Manual Check) " + manualCheck2);  // Output: false

    }

    // Manual implementation of endsWith (for educational purposes)
    public static boolean checkEndsWith(String str, String suffix) {
        if (suffix.length() > str.length()) {
            return false;
        }

        int strLen = str.length();
        int suffixLen = suffix.length();

        for (int i = 0; i < suffixLen; i++) {
            if (str.charAt(strLen - suffixLen + i) != suffix.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

