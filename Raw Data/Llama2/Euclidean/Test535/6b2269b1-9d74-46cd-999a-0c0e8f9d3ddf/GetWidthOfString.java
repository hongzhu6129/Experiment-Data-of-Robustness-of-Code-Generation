import java.util.Scanner;

public class GetWidthOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Get the width of the string
        int width = inputString.length();

        // Print the width of the string
        System.out.println("The width of the string is: " + width);
    }
}
