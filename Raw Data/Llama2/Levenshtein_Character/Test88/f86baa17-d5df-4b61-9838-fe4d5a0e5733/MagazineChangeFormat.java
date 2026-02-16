import java.util.Scanner;

public class MagazineChangeFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input magazine text
        String magazineText = scanner.nextLine();

        // Split the magazine text into words
        String[] words = magazineText.split(" ");

        // Reverse the order of the words
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        System.out.println();
    }
}
