import java.util.Scanner;

public class CharacterCounter {

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

        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
        scanner.close(); 
    }
}
