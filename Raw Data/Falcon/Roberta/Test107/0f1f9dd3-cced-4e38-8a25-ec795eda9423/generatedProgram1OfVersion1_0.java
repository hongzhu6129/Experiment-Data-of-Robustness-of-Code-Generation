import java.util.Scanner;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Split the input string into an array of words.
        String[] words = inputString.split(" ");

        // Reverse all odd-length words in the array.
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() % 2 != 0) {
                words[i] = reverseString(word);
            }
        }

        // Join the reversed words back into a string.
        String outputString = String.join(" ", words);

        // Print the output string.
        System.out.println("Reversed string: " + outputString);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
