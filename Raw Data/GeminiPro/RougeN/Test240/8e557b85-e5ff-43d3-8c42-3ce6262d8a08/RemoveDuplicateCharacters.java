import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a new string to store the result.
        String resultString = "";

        // Iterate over the input string and add each character to the result string if it is not already present.
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (!resultString.contains(String.valueOf(currentChar))) {
                resultString += currentChar;
            }
        }

        // Print the result string.
        System.out.println("The result string is: " + resultString);
    }
}
