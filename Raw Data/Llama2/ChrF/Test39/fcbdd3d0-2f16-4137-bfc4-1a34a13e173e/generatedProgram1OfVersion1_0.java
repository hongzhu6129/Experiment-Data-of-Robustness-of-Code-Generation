import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String inputSentence = scanner.nextLine();

        String capitalizedSentence = "";
        boolean newWord = true; // Flag to track the beginning of a word

        for (char c : inputSentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizedSentence += c;
                newWord = true; // Set flag to true for the next word
            } else {
                if (newWord) {
                    capitalizedSentence += Character.toUpperCase(c);
                    newWord = false; // Reset flag after capitalizing the first letter
                } else {
                    capitalizedSentence += c;
                }
            }
        }

        System.out.println(capitalizedSentence);
        scanner.close();
    }
}
