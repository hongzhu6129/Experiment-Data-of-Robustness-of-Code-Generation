public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "ProgrammingIsFun";
        String str2 = "Fun";
        String str3 = "fun";
        String str4 = "gramming";

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + str1.endsWith(str2)); // true
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + str1.endsWith(str3)); // false (case-sensitive)
        System.out.println("\"" + str1 + "\" ends with \"" + str4 + "\"? " + str1.endsWith(str4)); // false
        
        // Handling null and empty strings
        String str5 = null;
        String str6 = "";
        String str7 = "Example";

        // These examples demonstrate how endsWith behaves with null and empty strings.
        // Be mindful of potential NullPointerExceptions when working with null strings.
        //System.out.println("\"" + str5 + "\" ends with \"" + str2 + "\"? " + str5.endsWith(str2)); // Throws NullPointerException
        System.out.println("\"" + str7 + "\" ends with \"" + str5 + "\"? " + str7.endsWith(str5));// Throws NullPointerException
        System.out.println("\"" + str6 + "\" ends with \"" + str2 + "\"? " + str6.endsWith(str2)); // false
        System.out.println("\"" + str7 + "\" ends with \"" + str6 + "\"? " + str7.endsWith(str6)); // true (empty string is considered a suffix of any string)




    }
}
