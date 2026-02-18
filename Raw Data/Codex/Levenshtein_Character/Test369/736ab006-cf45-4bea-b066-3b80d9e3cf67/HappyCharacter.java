import java.util.Scanner;

public class HappyCharacter {

    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // Empty or single-character strings can't have happy characters
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check left neighbor (if it exists)
            if (i > 0 && str.charAt(i - 1) == currentChar) {
                return true;
            }

            // Check right neighbor (if it exists)
            if (i < str.length() - 1 && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false; // No happy character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HappyCharacter happyChecker = new HappyCharacter();

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        if (happyChecker.aCharacterIsHappy(inputString)) {
            System.out.println("The string contains a happy character.");
        } else {
            System.out.println("The string does not contain a happy character.");
        }
        
        scanner.close(); // Close the scanner
    }
}
