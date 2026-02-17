import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the string and the character sequence to compare
        System.out.println("Enter a string: ");
        String str1 = input.nextLine();
        System.out.println("Enter a character sequence: ");
        String str2 = input.nextLine();

        // Compare the strings
        boolean result = str1.equals(str2);

        // Print the result
        System.out.println("The result is: " + result);
    }
}
