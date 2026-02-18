import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert all characters to uppercase
        String output = input.toUpperCase();

        // Print the output
        System.out.println("The converted string is: " + output);
    }
}
