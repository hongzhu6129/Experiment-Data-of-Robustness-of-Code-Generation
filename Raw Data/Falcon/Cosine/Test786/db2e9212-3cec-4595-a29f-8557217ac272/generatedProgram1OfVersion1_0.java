import java.util.Scanner;

public class DivideMinor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the minor and the number of parts
        System.out.println("Enter the minor:");
        int minor = scanner.nextInt();
        System.out.println("Enter the number of parts:");
        int parts = scanner.nextInt();

        // Check if the minor is valid
        if (minor <= 0) {
            System.out.println("Invalid minor");
            return;
        }

        // Check if the number of parts is valid
        if (parts <= 0) {
            System.out.println("Invalid number of parts");
            return;
        }

        // Calculate the value of each part
        int partValue = minor / parts;

        // Print the value of each part
        System.out.println("The value of each part is:");
        System.out.println(partValue);
    }
}
