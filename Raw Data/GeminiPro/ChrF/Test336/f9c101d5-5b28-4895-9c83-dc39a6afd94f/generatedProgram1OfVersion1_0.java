public class AlphabetIndex {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            char character = alphabet.charAt(i);
            int index = alphabet.indexOf(character);
            System.out.println("Character: " + character + ", Index: " + index);
        }


        // Demonstration with user input (optional - but good practice for robustness):
        // Make sure to handle potential exceptions for invalid input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char inputChar = Character.toLowerCase(input.charAt(0)); // Handle case-insensitivity
            int inputIndex = alphabet.indexOf(inputChar);

            if (inputIndex != -1) { // -1 means not found
                System.out.println("Character: " + inputChar + ", Index: " + inputIndex);

            } else {
                System.out.println("Character not found in the alphabet.");
            }

        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }


         scanner.close(); // Close the scanner (good practice)


    }
}
