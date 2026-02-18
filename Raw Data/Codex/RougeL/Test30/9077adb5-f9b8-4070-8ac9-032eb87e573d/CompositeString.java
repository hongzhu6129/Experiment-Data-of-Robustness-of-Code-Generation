import java.util.Scanner;

public class CompositeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first part
        System.out.println("Enter the first part of the composite string:");
        String part1 = scanner.nextLine();

        // Get the second part
        System.out.println("Enter the second part of the composite string:");
        String part2 = scanner.nextLine();

        // Check if the second part is a minor part of the first part
        boolean isMinor = part2.length() < part1.length();

        // Create the composite string
        String composite = part1 + part2;

        // Print the composite string based on whether the second part is a minor part or not
        if (isMinor) {
            System.out.println("The composite string is: " + composite);
        } else {
            System.out.println("The second part is not a minor part of the first part. Therefore, the composite string cannot be formed.");
        }
    }
}
