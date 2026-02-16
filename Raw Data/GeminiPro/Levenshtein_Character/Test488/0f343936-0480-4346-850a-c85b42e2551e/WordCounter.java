import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();
        int wordCount = count_Words(inputString);
        System.out.println("Number of words in the string: " + wordCount);
        scanner.close();
    }

    public static int count_Words(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+"); // Split by whitespace
        return words.length;
    }
}
