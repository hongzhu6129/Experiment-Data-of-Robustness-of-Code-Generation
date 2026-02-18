import java.util.Scanner;

public class CheckIfTwoStringsAreRotationsOfEachOther {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Check if the two strings are of the same length.
        if (string1.length() != string2.length()) {
            System.out.println("The two strings are not of the same length, so they cannot be rotations of each other.");
            return;
        }

        // Concatenate the first string with itself and check if the second string is a substring of the concatenated string.
        String concatenatedString = string1 + string1;
        if (concatenatedString.contains(string2)) {
            System.out.println("The two strings are rotations of each other.");
        } else {
            System.out.println("The two strings are not rotations of each other.");
        }
    }
}
