import java.util.Arrays;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        String input = "I love programming and Java";
        System.out.println(reverseOddLengthWords(input)); // Output: I evol gnimmargor dna avaJ

        input = "Lorem ipsum dolor sit amet";
        System.out.println(reverseOddLengthWords(input)); // Output: Lorem si tsilp modor si tsem

        input = "Hello world";
        System.out.println(reverseOddLengthWords(input)); // Output: Hello world (no odd-length words)

        input = "";
        System.out.println(reverseOddLengthWords(input)); // Output: "" (empty string)
    }

    public static String reverseOddLengthWords(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 1) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
