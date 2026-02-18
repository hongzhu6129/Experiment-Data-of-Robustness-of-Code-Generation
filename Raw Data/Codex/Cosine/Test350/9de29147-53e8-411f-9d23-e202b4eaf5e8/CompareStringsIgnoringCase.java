import java.util.Scanner;

public class CompareStringsIgnoringCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Compare the two strings lexicographically, ignoring case differences.
        int comparisonResult = firstString.compareToIgnoreCase(secondString);

        // Print the comparison result.
        if (comparisonResult == 0) {
            System.out.println("The two strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
}
