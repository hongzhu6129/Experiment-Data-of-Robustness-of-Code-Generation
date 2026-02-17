import java.util.Scanner;

public class StringStartsWith {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the first string starts with the second string
        boolean startsWith = str1.startsWith(str2);

        // Print the result
        if (startsWith) {
            System.out.println("The first string starts with the second string.");
        } else {
            System.out.println("The first string does not start with the second string.");
        }
    }
}
