public class Main {

    public static void main(String[] args) {
        String str = "Hello World";
        String prefix = "Hello";

        boolean startsWithPrefix = str.startsWith(prefix);

        if (startsWithPrefix) {
            System.out.println("The string starts with \"" + prefix + "\"");
        } else {
            System.out.println("The string does not start with \"" + prefix + "\"");
        }


        // Example 2: Case-insensitive check (requires Java 11 or later)
        String str2 = "hello world";
        String prefix2 = "Hello";


        boolean startsWithPrefixCaseInsensitive = str2.startsWith(prefix2); // Case-sensitive by default

        if(startsWithPrefixCaseInsensitive) {
            System.out.println("The string starts with \"" + prefix2 + "\" (case-insensitive)");

        } else {
             System.out.println("The string does not start with \"" + prefix2 + "\" (case-insensitive)");
        }


        //For pre-Java 11 for case-insensitive:
        boolean startsWithPrefixCaseInsensitivePreJava11 = str2.toLowerCase().startsWith(prefix2.toLowerCase());

         if(startsWithPrefixCaseInsensitivePreJava11) {
            System.out.println("The string starts with \"" + prefix2 + "\" (case-insensitive - pre Java 11 method)");

        } else {
             System.out.println("The string does not start with \"" + prefix2 + "\" (case-insensitive - pre Java 11 method)");
        }



    }
}
