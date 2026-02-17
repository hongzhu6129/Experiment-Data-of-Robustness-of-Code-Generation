import java.util.Scanner;

public class DivideString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and number of parts
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the number of parts: ");
        int numParts = Integer.parseInt(scanner.nextLine());

        // Check if the number of parts is valid
        if (numParts <= 0 || inputString.length() % numParts != 0) {
            System.out.println("Invalid number of parts");
        } else {
            // Calculate the length of each part
            int partLength = inputString.length() / numParts;

            // Divide the string into parts
            for (int i = 0; i < numParts; i++) {
                int startIndex = i * partLength;
                int endIndex = (i + 1) * partLength;
                String part = inputString.substring(startIndex, endIndex);
                System.out.println("Part " + (i + 1) + ": " + part);
            }
        }

        scanner.close();
    }
}
