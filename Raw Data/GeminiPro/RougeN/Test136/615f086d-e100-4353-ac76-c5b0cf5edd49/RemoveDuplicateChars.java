import java.util.Scanner;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        // Create a new string to store the result
        String result = "";

        // Iterate over the input string
        for (int i = 0; i < input.length(); i++) {
            // Check if the character is not already in the result string
            if (!result.contains(input.charAt(i))) {
                // If not, add it to the result string
                result += input.charAt(i);
            }
        }

        // Print the result string
        System.out.println("The string with duplicate characters removed is: " + result);
    }
}
