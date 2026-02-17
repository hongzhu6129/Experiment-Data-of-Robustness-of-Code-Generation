import java.util.Scanner;

public class CreateCharacterRangingContainedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Get the starting and ending characters from the user.
        System.out.println("Enter the starting character: ");
        char startingCharacter = scanner.nextLine().charAt(0);

        System.out.println("Enter the ending character: ");
        char endingCharacter = scanner.nextLine().charAt(0);

        // Create a new string that contains the characters ranging from the starting character to the ending character.
        String newString = "";
        for (char c = startingCharacter; c <= endingCharacter; c++) {
            newString += c;
        }

        // Print the new string to the console.
        System.out.println("The new string is: " + newString);
    }
}
