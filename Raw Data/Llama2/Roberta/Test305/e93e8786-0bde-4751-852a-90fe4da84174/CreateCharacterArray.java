import java.util.Arrays;

public class CreateCharacterArray {

    public static void main(String[] args) {
        String str = "Hello World";

        // Create a character array from the string
        char[] charArray = str.toCharArray();

        // Print the character array
        System.out.println(Arrays.toString(charArray));
    }
}
