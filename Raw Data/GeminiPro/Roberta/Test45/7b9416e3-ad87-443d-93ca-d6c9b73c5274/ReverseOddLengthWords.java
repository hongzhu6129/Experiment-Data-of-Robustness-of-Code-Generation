import java.util.Scanner;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split(" ");

        // Reverse the odd-length words
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 1) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        // Join the words back into a string
        String output = String.join(" ", words);

        // Print the output string
        System.out.println(output);
    }
}
