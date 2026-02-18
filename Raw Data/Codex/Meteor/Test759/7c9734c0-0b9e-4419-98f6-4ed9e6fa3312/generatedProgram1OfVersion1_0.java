import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);
        scanner.close();
    }
}
