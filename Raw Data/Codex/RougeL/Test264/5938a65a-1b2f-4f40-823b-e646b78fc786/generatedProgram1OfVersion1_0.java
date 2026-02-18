import java.util.Scanner;

public class StringElider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the four strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        System.out.println("Enter the third string:");
        String thirdString = scanner.nextLine();
        System.out.println("Enter the fourth string:");
        String fourthString = scanner.nextLine();

        // Create a new string that will contain the elided characters.
        String elidedString = "";

        // Iterate over the four strings and add the first character of each string to the elided string.
        for (int i = 0; i < 4; i++) {
            elidedString += firstString.charAt(i);
            elidedString += secondString.charAt(i);
            elidedString += thirdString.charAt(i);
            elidedString += fourthString.charAt(i);
        }

        // Print the elided string.
        System.out.println("The elided string is: " + elidedString);
    }
}
