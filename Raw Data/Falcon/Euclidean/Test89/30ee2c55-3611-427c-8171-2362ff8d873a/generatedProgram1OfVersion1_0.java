import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        String input = scanner.nextLine();

        // Split the input string into an array of words
        String[] words = input.split(" ");

        // Find the longest word in the array
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Print the longest word
        System.out.println(longestWord);
    }
}
