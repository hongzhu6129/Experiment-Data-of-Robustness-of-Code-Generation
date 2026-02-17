import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
            return; // or handle the error differently, like prompting again
        }


        char character = input.charAt(0);
        int asciiValue = (int) character;

        System.out.println("The ASCII value of " + character + " is: " + asciiValue);
        scanner.close();
    }
}
