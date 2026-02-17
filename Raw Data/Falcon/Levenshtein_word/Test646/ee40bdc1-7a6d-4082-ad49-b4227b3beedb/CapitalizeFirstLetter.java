import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String capitalizedSentence = "";

        // Handle empty input
        if (sentence.isEmpty()) {
            System.out.println("");
            return;
        }

        // Capitalize the first letter of the first word.
        capitalizedSentence += Character.toUpperCase(sentence.charAt(0));


        // Iterate through the rest of the sentence
        for (int i = 1; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            char previousChar = sentence.charAt(i - 1);

            if (Character.isWhitespace(previousChar) && !Character.isWhitespace(currentChar)) {
                capitalizedSentence += Character.toUpperCase(currentChar);
            } else {
                capitalizedSentence += currentChar;
            }
        }

        System.out.println(capitalizedSentence);
        scanner.close(); // Close the scanner
    }
}
