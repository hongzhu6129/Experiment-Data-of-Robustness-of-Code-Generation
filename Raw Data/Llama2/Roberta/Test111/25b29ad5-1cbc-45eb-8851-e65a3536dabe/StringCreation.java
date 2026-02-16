import java.util.Scanner;

public class StringCreation {

    public static void main(String[] args) {
        // Create a String object using a string literal
        String str1 = "Hello World!";

        // Create a String object using the new keyword
        String str2 = new String("Hello World!");

        // Create a character array
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        // Create a String object from a character array
        String str3 = new String(chars);

        // Print the three String objects
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
