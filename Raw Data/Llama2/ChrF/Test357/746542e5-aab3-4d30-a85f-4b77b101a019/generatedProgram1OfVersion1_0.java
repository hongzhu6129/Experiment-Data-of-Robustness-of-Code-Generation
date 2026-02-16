import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the first string from the user.
        System.out.println("Enter the first string:");
        String firstString = sc.nextLine();

        // Get the second string from the user.
        System.out.println("Enter the second string:");
        String secondString = sc.nextLine();

        // Concatenate the two strings.
        String concatenatedString = firstString + secondString;

        // Print the concatenated string.
        System.out.println("The concatenated string is:");
        System.out.println(concatenatedString);
    }
}
