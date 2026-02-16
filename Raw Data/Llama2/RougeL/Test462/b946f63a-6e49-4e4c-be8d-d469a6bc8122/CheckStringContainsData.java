import java.util.Scanner;

public class CheckStringContainsData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three strings from the user.
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.println("Enter the third string: ");
        String string3 = scanner.nextLine();

        // Check if the three strings contain the data.
        boolean containsData = string1.contains(".") && string2.contains(".") && string3.contains(".");

        // Print the result.
        if (containsData) {
            System.out.println("The three strings contain the data.");
        } else {
            System.out.println("The three strings do not contain the data.");
        }
    }
}
