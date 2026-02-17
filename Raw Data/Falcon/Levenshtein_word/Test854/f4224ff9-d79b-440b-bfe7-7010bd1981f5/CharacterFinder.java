import java.util.Scanner;

public class CharacterFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and character to search for
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to search for: ");
        char ch = scanner.next().charAt(0);

        // Find the first occurrence of the character in the string
        int index = str.indexOf(ch);

        // Print the index of the character, or -1 if it was not found
        if (index == -1) {
            System.out.println("The character was not found in the string.");
        } else {
            System.out.println("The character was found at index " + index + ".");
        }
    }
}
