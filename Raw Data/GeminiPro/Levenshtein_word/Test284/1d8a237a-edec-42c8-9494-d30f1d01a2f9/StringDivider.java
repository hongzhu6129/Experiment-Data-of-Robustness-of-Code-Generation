import java.util.Scanner;

public class StringDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and the number of parts to divide it into
        System.out.println("Enter the string to divide:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the number of parts to divide the string into:");
        int numParts = scanner.nextInt();

        // Check if the number of parts is valid
        if (numParts <= 0) {
            System.out.println("Invalid number of parts: " + numParts);
            return;
        }

        // Calculate the length of each part
        int partLength = inputString.length() / numParts;

        // Divide the string into parts and print each part
        for (int i = 0; i < numParts; i++) {
            int startIndex = i * partLength;
            int endIndex = (i + 1) * partLength;

            String part = inputString.substring(startIndex, endIndex);
            System.out.println("Part " + (i + 1) + ": " + part);
        }
    }
}
