import java.util.Scanner;

public class StringStartsWith {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the second string begins with the first string.
        if (str2.startsWith(str1)) {
            System.out.println("The second string begins with the first string.");
        } else {
            System.out.println("The second string does not begin with the first string.");
        }
    }
}
