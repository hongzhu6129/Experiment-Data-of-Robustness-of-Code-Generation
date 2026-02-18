import java.util.Scanner;

public class ConcatenateMinor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the two strings.
        String concatenatedString = str1 + str2 + str1;

        // Print the concatenated string.
        System.out.println("The concatenated string is: " + concatenatedString);
    }
}
