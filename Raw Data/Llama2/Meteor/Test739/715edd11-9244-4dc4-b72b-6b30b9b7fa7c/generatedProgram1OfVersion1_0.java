import java.util.Scanner;

public class Lexicographically {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings from the user.
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Convert the strings to lowercase for comparison.
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Compare the strings lexicographically.
        int comparison = firstString.compareTo(secondString);

        // Print the result.
        if (comparison < 0) {
            System.out.println("The first string is lexicographically before the second string.");
        } else if (comparison > 0) {
            System.out.println("The second string is lexicographically before the first string.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }
    }
}
