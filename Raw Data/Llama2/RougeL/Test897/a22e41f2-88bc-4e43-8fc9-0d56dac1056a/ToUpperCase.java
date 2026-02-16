import java.util.Scanner;

public class ToUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to uppercase
        String output = input.toUpperCase();

        // Print the uppercase string
        System.out.println("Uppercase string: " + output);
    }
}
