import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {
        // Get the input string from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Remove the spaces from the string.
        String output = input.replaceAll(" ", "");

        // Print the resulting string.
        System.out.println("The resulting string is: " + output);
    }
}
