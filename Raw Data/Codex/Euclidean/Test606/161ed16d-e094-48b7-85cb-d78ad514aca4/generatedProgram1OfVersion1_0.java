import java.util.Scanner;

public class NasdaqParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();

        // Split the input string into parts
        String[] parts = input.split(" ");

        // Check if the input string is valid
        if (parts.length != 4) {
            System.out.println("Invalid input string");
            return;
        }

        // Get the getting part
        String gettingPart = parts[0];

        // Get the portrayed part
        String portrayedPart = parts[1];

        // Get the opened part
        String openedPart = parts[2];

        // Get the divided part
        String dividedPart = parts[3];

        // Check if the getting part is valid
        if (!gettingPart.equals("getting")) {
            System.out.println("Invalid getting part");
            return;
        }

        // Check if the portrayed part is valid
        if (!portrayedPart.equals("portrayed")) {
            System.out.println("Invalid portrayed part");
            return;
        }

        // Check if the opened part is valid
        if (!openedPart.equals("opened")) {
            System.out.println("Invalid opened part");
            return;
        }

        // Check if the divided part is valid
        if (!dividedPart.equals("divided")) {
            System.out.println("Invalid divided part");
            return;
        }

        // Print the output
        System.out.println("The input string is valid");
    }
}
