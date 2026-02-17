import java.util.Scanner;

public class DivideMinorIntoKEqualParts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the minor from the user.
        System.out.println("Enter the minor: ");
        int minor = input.nextInt();

        // Get the number of equal parts from the user.
        System.out.println("Enter the number of equal parts: ");
        int k = input.nextInt();

        // Check if the minor is valid.
        if (minor <= 0) {
            System.out.println("Invalid minor");
            return;
        }

        // Check if the number of equal parts is valid.
        if (k <= 0) {
            System.out.println("Invalid number of equal parts");
            return;
        }

        // Check if the minor is divisible by the number of equal parts.
        if (minor % k != 0) {
            System.out.println("The minor is not divisible by the number of equal parts");
            return;
        }

        // Calculate the value of each equal part.
        int equalPart = minor / k;

        // Print the value of each equal part.
        System.out.println("The value of each equal part is: " + equalPart);
    }
}
