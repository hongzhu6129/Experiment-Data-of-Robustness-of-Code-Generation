import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the length of the string using the length() method
        int length = str.length();

        // Print the length of the string
        System.out.println("The length of the string is: " + length);
    }
}
