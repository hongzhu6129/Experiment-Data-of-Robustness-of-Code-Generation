public class StringEndsWith {

    public static void main(String[] args) {
        // Example usage:
        String str1 = "Hello World";
        String str2 = "World";
        boolean endsWith = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);


        str1 = "This is a test";
        str2 = "test";
        endsWith = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);



        str1 = "coding";
        str2 = "ing";
        endsWith = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);



        str1 = "Hello";
        str2 = "hello";  // Case-sensitive
        endsWith = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);
    }
}
