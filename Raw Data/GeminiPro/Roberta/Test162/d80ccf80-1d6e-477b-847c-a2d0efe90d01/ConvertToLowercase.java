import java.util.Scanner;

public class ConvertToLowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Print the lowercase string
        System.out.println("Lowercase string: " + lowercaseString);
    }
}
