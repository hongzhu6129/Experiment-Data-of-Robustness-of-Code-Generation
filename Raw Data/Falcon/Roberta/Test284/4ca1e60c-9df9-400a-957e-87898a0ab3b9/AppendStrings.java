import java.util.Scanner;

public class AppendStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first and second strings from the user
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Append the two strings, omitting one character if the concatenation creates double characters
        String appendedString = appendStrings(firstString, secondString);

        // Print the appended string
        System.out.println("The appended string is: " + appendedString);
    }

    public static String appendStrings(String firstString, String secondString) {
        // Create a new string builder to hold the appended string
        StringBuilder appendedString = new StringBuilder();

        // Append the first string to the new string builder
        appendedString.append(firstString);

        // Append the second string to the new string builder, omitting one character if the concatenation creates double characters
        for (char character : secondString.toCharArray()) {
            if (appendedString.length() == 0 || appendedString.charAt(appendedString.length() - 1) != character) {
                appendedString.append(character);
            }
        }

        // Return the appended string
        return appendedString.toString();
    }
}
