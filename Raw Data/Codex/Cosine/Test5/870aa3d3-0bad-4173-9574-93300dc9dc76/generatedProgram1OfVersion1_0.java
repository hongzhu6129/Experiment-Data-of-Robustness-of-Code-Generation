import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        // Get the second string from the user.
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Concatenate the two strings.
        String concatenatedString = firstString + secondString;

        // Print the concatenated string.
        System.out.println("The concatenated string is:");
        System.out.println(concatenatedString);
    }
}
