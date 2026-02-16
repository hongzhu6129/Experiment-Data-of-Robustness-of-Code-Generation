import java.util.Scanner;

public class ToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to lowercase.
        String lowercaseString = inputString.toLowerCase();

        // Print the lowercase string.
        System.out.println("The lowercase string is: " + lowercaseString);
    }
}
