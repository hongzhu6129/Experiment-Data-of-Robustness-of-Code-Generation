import java.util.Scanner;

public class CharacterTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input and output buffers
        String inputBuffer = scanner.nextLine();
        String outputBuffer = "";

        // Get the vocabulary
        String vocabulary = scanner.nextLine();

        // Translate the characters
        for (int i = 0; i < inputBuffer.length(); i++) {
            char c = inputBuffer.charAt(i);
            int index = vocabulary.indexOf(c);
            if (index >= 0) {
                outputBuffer += vocabulary.charAt(index + 1);
            } else {
                outputBuffer += c;
            }
        }

        // Print the output buffer
        System.out.println(outputBuffer);
    }
}
