import java.util.*;

public class Translate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for (String word : words) {
            String translation = translate(word);
            System.out.print(translation + " ");
        }
        System.out.println();
    }

    public static String translate(String word) {
        switch (word) {
            case "any":
                return "cualquier";
            case "another":
                return "otro";
            case "applicable":
                return "aplicable";
            case "buffer":
                return "b�fer";
            default:
                return word;
        }
    }
}
