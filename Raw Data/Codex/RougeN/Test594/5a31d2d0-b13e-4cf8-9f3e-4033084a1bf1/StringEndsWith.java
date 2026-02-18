public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";


        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + str1.endsWith(str2));
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + str1.endsWith(str3));


        // Additional examples for demonstration:
        System.out.println("\"\" ends with \"\"? " + "".endsWith("")); // Empty string ends with empty string (true)
        System.out.println("\"Hello\" ends with \"llo \"? " + "Hello".endsWith("llo ")); // Notice the space (false)
        System.out.println("\"Java\" ends with \"a\"? " + "Java".endsWith("a")); // Single character ending (true)

    }
}
