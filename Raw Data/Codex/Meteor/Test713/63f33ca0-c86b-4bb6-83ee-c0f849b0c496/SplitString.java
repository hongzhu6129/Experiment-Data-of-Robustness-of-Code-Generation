import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and the number of parts to split it into
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the number of parts to split the string into: ");
        int numParts = scanner.nextInt();

        // Check if the number of parts is valid
        if (numParts <= 0) {
            System.out.println("Invalid number of parts. Please enter a positive integer.");
            return;
        }

        // Check if the string is empty
        if (inputString.isEmpty()) {
            System.out.println("The string is empty. Please enter a non-empty string.");
            return;
        }

        // Split the string into parts
        int partLength = inputString.length() / numParts;
        String[] parts = new String[numParts];
        for (int i = 0; i < numParts; i++) {
            parts[i] = inputString.substring(i * partLength, (i + 1) * partLength);
        }

        // Print the parts
        System.out.println("The parts of the string are: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
