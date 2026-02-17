import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a new string to store the doubled characters
        String doubledString = "";

        // Iterate over the characters in the input string
        for (char character : inputString.toCharArray()) {
            // Append the character twice to the doubled string
            doubledString += character + "" + character;
        }

        // Print the doubled string
        System.out.println("The doubled string is: " + doubledString);
    }
}
