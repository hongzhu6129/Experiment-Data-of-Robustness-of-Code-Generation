import java.util.Scanner;

public class ConvertToUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to uppercase
        String upperCaseString = inputString.toUpperCase();

        // Print the uppercase string to the console
        System.out.println("The uppercase string is: " + upperCaseString);
    }
}
