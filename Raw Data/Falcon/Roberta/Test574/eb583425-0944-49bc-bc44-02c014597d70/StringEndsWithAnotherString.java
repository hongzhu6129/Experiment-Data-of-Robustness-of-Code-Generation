import java.util.Scanner;

public class StringEndsWithAnotherString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the first string ends with the second string
        boolean endsWith = firstString.endsWith(secondString);

        // Print the result
        if (endsWith) {
            System.out.println("The first string ends with the second string.");
        } else {
            System.out.println("The first string does not end with the second string.");
        }
    }
}
