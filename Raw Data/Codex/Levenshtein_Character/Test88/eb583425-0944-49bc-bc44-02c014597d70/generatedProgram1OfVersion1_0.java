public class StringEndsWithString {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + str1.endsWith(str2));
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + str1.endsWith(str3));


        //  More examples for demonstration:
        System.out.println("\"\" ends with \"\"? " + "".endsWith("")); // Empty string ends with itself
        System.out.println("\"Hello\" ends with \"llo\"? " + "Hello".endsWith("llo"));
        System.out.println("\"Hello\" ends with \"hello\"? " + "Hello".endsWith("hello")); // Case-sensitive
        System.out.println("\"Hello\" ends with \"Hello \"? " + "Hello".endsWith("Hello ")); // Includes space, so false



    }
}
