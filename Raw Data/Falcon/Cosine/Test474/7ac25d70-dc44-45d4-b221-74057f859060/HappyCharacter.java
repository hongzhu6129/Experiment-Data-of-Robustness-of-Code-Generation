import java.util.Scanner;

public class HappyCharacter {

    /**
     * Checks if a specified character is happy in a string.
     *
     * @param inputString The string to check.
     * @return True if the character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String inputString) {
        if (inputString == null || inputString.length() <= 1) {
            return false; // Empty or single-character strings cannot have happy characters
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character to check: ");
        char specifiedChar = scanner.next().charAt(0);
        scanner.close();


        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (currentChar == specifiedChar) {
                // Check left (if possible)
                if (i > 0 && inputString.charAt(i - 1) == specifiedChar) {
                    return true;
                }
                // Check right (if possible)
                if (i < inputString.length() - 1 && inputString.charAt(i + 1) == specifiedChar) {
                    return true;
                }
            }
        }

        return false; // Character is not happy
    }

    /**
     * Main method to demonstrate the happy character check.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        HappyCharacter checker = new HappyCharacter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        scanner.close();
       
        boolean isHappy = checker.aCharacterIsHappy(inputString);

        if (isHappy) {
            System.out.println("The character is happy.");
        } else {
            System.out.println("The character is not happy.");
        }
    }
}
