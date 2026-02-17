import java.util.Scanner;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 1) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        System.out.println("Reversed odd-length words: " + String.join(" ", words));
    }
}
