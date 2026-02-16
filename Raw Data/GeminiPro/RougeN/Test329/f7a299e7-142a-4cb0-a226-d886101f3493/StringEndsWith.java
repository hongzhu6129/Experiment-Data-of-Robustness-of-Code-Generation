public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + checkEndsWith(str1, str2));
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + checkEndsWith(str1, str3));

          // Additional test cases demonstrating empty strings and null handling
        System.out.println("\"" + str1 + "\" ends with \"\"? " + checkEndsWith(str1,"")); 
        System.out.println("\"\" ends with \""+ str2 + "\"? " + checkEndsWith("", str2));
        System.out.println("\"\" ends with \"\"? " + checkEndsWith("", ""));

        // Demonstrating null handling (should print false without crashing)
        System.out.println("\"" + str1 + "\" ends with null? " + checkEndsWith(str1, null));
        System.out.println("null ends with \"" + str2 + "\"? " + checkEndsWith(null, str2)); // Corrected null check
        System.out.println("null ends with null? " + checkEndsWith(null, null));


    }

    private static boolean checkEndsWith(String str, String suffix) {
        if (str == null || suffix == null) { // Handle nulls gracefully
            return false;
        }

        int strLen = str.length();
        int suffixLen = suffix.length();

        if (suffixLen > strLen) {
            return false;
        }

        return str.substring(strLen - suffixLen).equals(suffix);

    }
}


