import java.util.Scanner;

public class ConvertToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase
        String lowercase = input.toLowerCase();

        // Print the lowercase string
        System.out.println("The lowercase string is: " + lowercase);
    }
}
