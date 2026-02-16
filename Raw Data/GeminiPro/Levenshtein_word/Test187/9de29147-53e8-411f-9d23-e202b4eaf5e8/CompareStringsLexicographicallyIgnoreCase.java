import java.util.Scanner;

public class CompareStringsLexicographicallyIgnoreCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings from the user.
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Compare the two strings lexicographically, ignoring case differences.
        int comparisonResult = string1.compareToIgnoreCase(string2);

        // Print the comparison result.
        if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }
    }
}
