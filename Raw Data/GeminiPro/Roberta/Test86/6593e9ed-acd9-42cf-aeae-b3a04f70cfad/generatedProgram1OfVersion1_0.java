import java.util.Scanner;

public class CompareStringsIgnoreCase {
    public static boolean compareStringsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two strings from the user.
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Compare the two strings, ignoring case.
        boolean result = compareStringsIgnoreCase(str1, str2);

        // Print the result.
        if (result) {
            System.out.println("The two strings are equal, ignoring case.");
        } else {
            System.out.println("The two strings are not equal, ignoring case.");
        }
    }
}
