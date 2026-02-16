public class StringEnds {

    public boolean anyStringAtEnd(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }

    public static void main(String[] args) {
        StringEnds se = new StringEnds();

        String str1 = "Python";
        String str2 = "on";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: true

        str1 = "Java";
        str2 = "script";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2)); // Output: false

        str1 = "Hello";
        str2 = "hello";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: true


        str1 = "AbCd";
        str2 = "cd";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: true

        str1 = "Python";
        str2 = "thonx";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: false
        
        str1 = ""; // Empty string test case
        str2 = "test";
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: false

        str1 = "test";
        str2 = ""; // Empty string test case
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\": " + se.anyStringAtEnd(str1, str2));  // Output: true // Any string ends with an empty string


    }
}
