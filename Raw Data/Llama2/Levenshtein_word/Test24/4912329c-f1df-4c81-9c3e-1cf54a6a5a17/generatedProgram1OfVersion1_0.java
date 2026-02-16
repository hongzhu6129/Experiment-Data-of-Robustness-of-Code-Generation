import java.util.*;

public class LanguageReplacingSpecificCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string:");
        String inputString = input.nextLine();

        // Get the character to replace
        System.out.println("Enter the character to replace:");
        char replaceChar = input.next().charAt(0);

        // Get the replacement character
        System.out.println("Enter the replacement character:");
        char replacementChar = input.next().charAt(0);

        // Replace all occurrences of the character in the string
        String replacedString = inputString.replace(replaceChar, replacementChar);

        // Print the replaced string
        System.out.println("The replaced string is: " + replacedString);
    }
}
