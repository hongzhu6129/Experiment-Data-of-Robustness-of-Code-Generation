import java.util.Scanner;

public class DivideMinor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the minor and the number of parts
        System.out.print("Enter the minor: ");
        int minor = input.nextInt();

        System.out.print("Enter the number of parts: ");
        int numParts = input.nextInt();

        // Check if the minor is valid
        if (minor <= 0) {
            System.out.println("Invalid minor");
            return;
        }

        // Check if the number of parts is valid
        if (numParts <= 0) {
            System.out.println("Invalid number of parts");
            return;
        }

        // Divide the minor into the specified number of parts
        int[] parts = new int[numParts];
        for (int i = 0; i < numParts; i++) {
            parts[i] = minor / numParts;
        }

        // Add the remainder to the last part
        parts[numParts - 1] += minor % numParts;

        // Print the parts
        System.out.println("The parts are: ");
        for (int part : parts) {
            System.out.println(part);
        }
    }
}
