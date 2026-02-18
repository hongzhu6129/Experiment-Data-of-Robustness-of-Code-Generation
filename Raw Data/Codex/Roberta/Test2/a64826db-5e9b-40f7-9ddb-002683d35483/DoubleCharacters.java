import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a new string to store the doubled characters
        String doubledString = "";

        // Iterate over each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            // Get the current character
            char currentChar = inputString.charAt(i);

            // Add the current character twice to the doubled string
            doubledString += currentChar + "" + currentChar;
        }

        // Print the doubled string
        System.out.println("Doubled string: " + doubledString);
    }
}
