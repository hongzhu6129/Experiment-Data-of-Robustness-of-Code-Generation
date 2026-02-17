import java.util.Scanner;

public class CreateCharArrayFromString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a character array to store the input string
        char[] charArray = inputString.toCharArray();

        // Print the character array
        System.out.println("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
