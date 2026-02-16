import java.util.Scanner;

public class Lexicographically {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Convert the strings to lowercase and remove all spaces.
        firstString = firstString.toLowerCase().replaceAll(" ", "");
        secondString = secondString.toLowerCase().replaceAll(" ", "");

        // Compare the two strings lexicographically.
        int comparison = firstString.compareTo(secondString);

        // Print the result.
        if (comparison == 0) {
            System.out.println("The two strings are lexicographically equal.");
        } else if (comparison < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }
    }
}
