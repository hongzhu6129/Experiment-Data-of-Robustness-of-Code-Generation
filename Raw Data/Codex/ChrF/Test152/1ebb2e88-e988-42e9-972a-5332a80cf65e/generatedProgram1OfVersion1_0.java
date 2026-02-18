import java.util.Scanner;

public class CheckSameMinorEndsString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the two strings have the same minor ends.
        boolean haveSameMinorEnds = false;
        if (firstString.length() > 0 && secondString.length() > 0) {
            char firstMinorEnd = firstString.charAt(firstString.length() - 1);
            char secondMinorEnd = secondString.charAt(secondString.length() - 1);

            if (firstMinorEnd == secondMinorEnd) {
                haveSameMinorEnds = true;
            }
        }

        // Print the result.
        if (haveSameMinorEnds) {
            System.out.println("The two strings have the same minor ends.");
        } else {
            System.out.println("The two strings do not have the same minor ends.");
        }
    }
}
