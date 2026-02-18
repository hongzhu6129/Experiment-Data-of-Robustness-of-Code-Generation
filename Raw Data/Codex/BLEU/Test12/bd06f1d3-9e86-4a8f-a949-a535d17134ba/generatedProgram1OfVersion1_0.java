import java.util.Scanner;

public class SlowWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input word
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Slow the word using three different methods
        String slow1 = slowWord1(word);
        String slow2 = slowWord2(word);
        String slow3 = slowWord3(word);

        // Print the results
        System.out.println("Slowed word using method 1: " + slow1);
        System.out.println("Slowed word using method 2: " + slow2);
        System.out.println("Slowed word using method 3: " + slow3);
    }

    private static String slowWord1(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(c);
            sb.append("-");
        }
        return sb.toString();
    }

    private static String slowWord2(String word) {
        return word.replace("", "-");
    }

    private static String slowWord3(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            chars[i + 1] = '-';
        }
        return String.valueOf(chars);
    }
}
