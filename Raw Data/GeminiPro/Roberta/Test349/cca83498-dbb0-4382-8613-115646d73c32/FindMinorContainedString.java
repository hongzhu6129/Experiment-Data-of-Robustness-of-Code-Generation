import java.util.Scanner;

public class FindMinorContainedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();

        // Get the minor string
        System.out.println("Enter the minor string:");
        String minorString = scanner.nextLine();

        // Check if the minor string is contained in the input string
        if (inputString.contains(minorString)) {
            System.out.println("The minor string is contained in the input string.");
        } else {
            System.out.println("The minor string is not contained in the input string.");
        }

        scanner.close();
    }
}
