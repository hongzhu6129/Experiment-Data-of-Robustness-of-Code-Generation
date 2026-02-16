import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings to compare
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Compare the two strings using the compareTo() method
        int result = str1.compareTo(str2);

        // Print the result
        if (result == 0) {
            System.out.println("The two strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
}
