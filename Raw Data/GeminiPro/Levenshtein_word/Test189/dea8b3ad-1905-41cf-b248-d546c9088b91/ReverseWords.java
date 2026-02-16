import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string.
        String input = scanner.nextLine();

        // Reverse the words in the string.
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            reversed.append(" ");
        }

        // Print the reversed string.
        System.out.println(reversed.toString());
    }
}
