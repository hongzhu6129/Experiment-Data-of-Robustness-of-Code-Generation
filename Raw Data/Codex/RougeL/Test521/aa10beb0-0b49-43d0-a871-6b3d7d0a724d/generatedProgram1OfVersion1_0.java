import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        // Concatenate the two strings.
        String concatenatedString = firstString + secondString;

        // Print the concatenated string.
        System.out.println("The concatenated string is: " + concatenatedString);
    }
}
