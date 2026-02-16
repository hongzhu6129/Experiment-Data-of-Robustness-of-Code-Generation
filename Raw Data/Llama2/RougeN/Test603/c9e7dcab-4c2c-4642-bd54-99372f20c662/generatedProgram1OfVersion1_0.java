import java.util.Scanner;

public class FabricateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize the count variable to 0.
        int count = 0;

        // Iterate over the input string and count the number of characters.
        for (int i = 0; i < inputString.length(); i++) {
            count++;
        }

        // Print the count of characters in the input string.
        System.out.println("The number of characters in the input string is: " + count);
    }
}
