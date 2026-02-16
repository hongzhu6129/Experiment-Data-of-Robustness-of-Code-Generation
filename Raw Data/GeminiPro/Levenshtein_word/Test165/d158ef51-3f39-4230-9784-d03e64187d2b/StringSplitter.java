import java.util.Scanner;

public class StringSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and the number of parts to divide it into
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the number of parts: ");
        int numParts = scanner.nextInt();

        // Check if the number of parts is valid
        if (numParts <= 0) {
            System.out.println("Invalid number of parts. Please enter a positive integer.");
            return;
        }

        // Calculate the length of each part
        int partLength = inputString.length() / numParts;

        // Divide the string into parts and store them in an array
        String[] parts = new String[numParts];
        for (int i = 0; i < numParts; i++) {
            parts[i] = inputString.substring(i * partLength, (i + 1) * partLength);
        }

        // Print the parts
        System.out.println("The string divided into " + numParts + " parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
