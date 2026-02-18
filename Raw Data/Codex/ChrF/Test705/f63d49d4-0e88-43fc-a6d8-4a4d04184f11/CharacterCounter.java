import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize the character count to 1
        int count = 1;

        // Iterate over the input string
        for (int i = 1; i < inputString.length(); i++) {
            // Check if the current character is the same as the previous character
            if (inputString.charAt(i) == inputString.charAt(i - 1)) {
                // Increment the character count
                count++;
            } else {
                // Print the character and its count
                System.out.println(inputString.charAt(i - 1) + " " + count);
                
                // Reset the character count to 1
                count = 1;
            }
        }

        // Print the last character and its count
        System.out.println(inputString.charAt(inputString.length() - 1) + " " + count);
    }
}
