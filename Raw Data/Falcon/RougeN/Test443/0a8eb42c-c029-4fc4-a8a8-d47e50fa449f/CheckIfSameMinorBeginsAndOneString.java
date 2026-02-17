import java.util.Scanner;

public class CheckIfSameMinorBeginsAndOneString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        // Check if the two strings have the same minor.
        boolean sameMinor = firstString.toLowerCase().startsWith(secondString.toLowerCase());

        // Print the result.
        if (sameMinor) {
            System.out.println("The two strings have the same minor.");
        } else {
            System.out.println("The two strings do not have the same minor.");
        }
    }
}
