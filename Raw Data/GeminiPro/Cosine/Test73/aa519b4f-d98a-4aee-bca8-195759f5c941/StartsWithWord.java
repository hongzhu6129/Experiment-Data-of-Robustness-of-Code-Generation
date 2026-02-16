public class StartsWithWord {

    public static void main(String[] args) {
        String str = "Hello World";
        String word = "Hello";

        boolean startsWith = str.startsWith(word);

        if (startsWith) {
            System.out.println("The string starts with \"" + word + "\"");
        } else {
            System.out.println("The string does not start with \"" + word + "\"");
        }



        // More examples for demonstration within main:

        String str2 = "This is another string";
        String word2 = "This is"; 
        System.out.println("\"" + str2 + "\" starts with \"" + word2 + "\"? " + str2.startsWith(word2));


        String str3 = "Testing";
        String word3 = "test"; // Case-sensitive!
        System.out.println("\"" + str3 + "\" starts with \"" + word3 + "\"? " + str3.startsWith(word3));



        String str4 = "   Whitespace at beginning";
        String word4 = "Whitespace";
        System.out.println("\"" + str4 + "\" starts with \"" + word4 + "\"? " + str4.startsWith(word4)); // Leading whitespace matters

    }
}
