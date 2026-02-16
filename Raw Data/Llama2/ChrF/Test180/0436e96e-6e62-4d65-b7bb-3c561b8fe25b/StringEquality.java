import java.util.Scanner;

public class StringEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three strings from the user.
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();
        System.out.println("Enter the third string:");
        String string3 = scanner.nextLine();

        // Check if the three strings are equal.
        boolean isEqual = string1.equals(string2) && string2.equals(string3);

        // Print the result.
        if (isEqual) {
            System.out.println("The three strings are equal.");
        } else {
            System.out.println("The three strings are not equal.");
        }
    }
}
