import java.util.Scanner;

public class StringDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the number of parts to divide the string into
        System.out.println("Enter the number of parts to divide the string into: ");
        int numParts = Integer.parseInt(scanner.nextLine());

        // Divide the string into n individual parts
        String[] parts = divideString(inputString, numParts);

        // Print the divided string
        System.out.println("The divided string is: ");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }

    public static String[] divideString(String inputString, int numParts) {
        // Check if the number of parts is valid
        if (numParts <= 0) {
            throw new IllegalArgumentException("The number of parts must be greater than 0");
        }

        // Check if the string is empty
        if (inputString.isEmpty()) {
            return new String[numParts];
        }

        // Calculate the length of each part
        int partLength = inputString.length() / numParts;

        // Divide the string into n individual parts
        String[] parts = new String[numParts];
        int startIndex = 0;
        int endIndex = partLength;
        for (int i = 0; i < numParts; i++) {
            parts[i] = inputString.substring(startIndex, endIndex);
            startIndex += partLength;
            endIndex += partLength;
        }

        // Return the divided string
        return parts;
    }
}
