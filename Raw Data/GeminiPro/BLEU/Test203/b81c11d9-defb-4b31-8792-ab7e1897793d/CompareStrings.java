import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        // Compare the two strings.
        int comparisonResult = firstString.compareTo(secondString);

        // Print the result.
        if (comparisonResult == 0) {
            System.out.println("The two strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
}
