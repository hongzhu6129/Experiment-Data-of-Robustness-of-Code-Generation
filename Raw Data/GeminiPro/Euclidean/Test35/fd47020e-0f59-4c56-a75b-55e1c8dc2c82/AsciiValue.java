import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        // Read a single character from the user.  Handles potential empty input.
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("You did not enter a character.");
            return; // Exit if no input provided
        }
        char character = input.charAt(0);


        int asciiValue = (int) character;

        System.out.println("The ASCII value of " + character + " is: " + asciiValue);
        scanner.close();
    }
}
