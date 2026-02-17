import java.util.Scanner;

public class StringDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string.
        System.out.println("Enter the string to be divided:");
        String s = scanner.nextLine();

        // Get the number of parts to divide the string into.
        System.out.println("Enter the number of parts to divide the string into:");
        int k = scanner.nextInt();

        // Check if the number of parts is valid.
        if (k <= 0) {
            System.out.println("Invalid number of parts.");
            return;
        }

        // Check if the string can be divided into the given number of parts.
        if (s.length() % k != 0) {
            System.out.println("The string cannot be divided into the given number of parts.");
            return;
        }

        // Divide the string into k parts.
        String[] parts = new String[k];
        for (int i = 0; i < k; i++) {
            parts[i] = s.substring(i * s.length() / k, (i + 1) * s.length() / k);
        }

        // Print the parts of the string.
        System.out.println("The parts of the string are:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
