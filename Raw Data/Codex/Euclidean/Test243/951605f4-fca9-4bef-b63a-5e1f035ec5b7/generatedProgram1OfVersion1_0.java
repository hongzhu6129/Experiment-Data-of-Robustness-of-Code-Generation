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


        // Demonstrating edge cases (empty strings)
        String emptyString = "";
        String someString = "Example";

        System.out.println("\"" + someString + "\" ends with \"" + emptyString + "\"? " + someString.endsWith(emptyString));
        System.out.println("\"" + emptyString + "\" ends with \"" + someString + "\"? " + emptyString.endsWith(someString));
        System.out.println("\"" + emptyString + "\" ends with \"" + emptyString + "\"? " + emptyString.endsWith(emptyString));

        // Using substring for demonstration (less efficient than endsWith())
        if (str1.length() >= str2.length()) {
            String lastPart = str1.substring(str1.length() - str2.length());
            boolean manualCheck = lastPart.equals(str2);
            System.out.println("Manual check using substring: \"" + str1 + "\" ends with \"" + str2 + "\"? " + manualCheck);
        } else {
            System.out.println("Manual check using substring: \"" + str1 + "\" cannot end with \"" + str2 + "\" because it's shorter.");
        }

    }
}
