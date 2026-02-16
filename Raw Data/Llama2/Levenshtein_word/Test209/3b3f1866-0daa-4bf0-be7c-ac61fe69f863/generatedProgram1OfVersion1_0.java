import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the two strings.
        boolean areEqual = str1.equals(str2);

        // Print the result.
        if (areEqual) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
}
