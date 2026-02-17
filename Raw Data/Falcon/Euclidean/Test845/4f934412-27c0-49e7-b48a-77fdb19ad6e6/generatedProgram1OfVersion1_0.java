import java.util.Scanner;

public class StringComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Compare the two strings.
        int comparisonResult = string1.compareTo(string2);

        // Print the result of the comparison.
        if (comparisonResult == 0) {
            System.out.println("The two strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
}
