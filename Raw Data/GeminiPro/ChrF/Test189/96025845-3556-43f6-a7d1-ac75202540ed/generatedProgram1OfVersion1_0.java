import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        String reversedString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }

        System.out.println("Reversed string: " + reversedString);
    }
}
