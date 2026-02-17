import java.util.Scanner;

public class DivideStringIntoIndividualParts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and the number of parts to divide it into
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the number of parts: ");
        int numParts = scanner.nextInt();

        // Check if the number of parts is valid
        if (numParts <= 0) {
            System.out.println("Invalid number of parts");
            return;
        }

        // Divide the string into individual parts
        String[] parts = new String[numParts];
        for (int i = 0; i < numParts; i++) {
            parts[i] = inputString.substring(i * (inputString.length() / numParts), (i + 1) * (inputString.length() / numParts));
        }

        // Print the divided parts
        System.out.println("The divided parts are: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
