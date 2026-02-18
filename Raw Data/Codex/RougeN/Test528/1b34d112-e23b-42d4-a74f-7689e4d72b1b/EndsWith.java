import java.util.Scanner;

public class EndsWith {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and ending substring
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter an ending substring: ");
        String ending = scanner.nextLine();

        // Check if the string ends with the ending substring
        boolean result = str.endsWith(ending);

        // Print the result
        if (result) {
            System.out.println("The string ends with the ending substring.");
        } else {
            System.out.println("The string does not end with the ending substring.");
        }
    }
}
