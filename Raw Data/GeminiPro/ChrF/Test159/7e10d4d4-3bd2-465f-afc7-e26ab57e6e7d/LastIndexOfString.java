import java.util.Scanner;

public class LastIndexOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings from the user.
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the last index of the second string within the first string.
        int lastIndex = str1.lastIndexOf(str2);

        // Print the last index of the second string within the first string.
        System.out.println("The last index of the second string within the first string is: " + lastIndex);
    }
}
