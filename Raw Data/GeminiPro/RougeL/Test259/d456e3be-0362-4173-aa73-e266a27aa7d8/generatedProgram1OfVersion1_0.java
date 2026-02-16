import java.util.Scanner;

public class CheckIfStringAStartsWithStringB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two strings from the user.
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Check if the first string starts with the second string.
        boolean startsWith = str1.startsWith(str2);

        // Print the result.
        if (startsWith) {
            System.out.println("The first string starts with the second string.");
        } else {
            System.out.println("The first string does not start with the second string.");
        }
    }
}
