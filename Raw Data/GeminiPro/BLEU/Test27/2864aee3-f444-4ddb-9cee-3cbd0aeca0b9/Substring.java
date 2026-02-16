import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the starting and ending positions of the substring
        System.out.println("Enter the starting position: ");
        int start = scanner.nextInt();

        System.out.println("Enter the ending position: ");
        int end = scanner.nextInt();

        // Get the substring
        String substring = str.substring(start, end);

        // Print the substring
        System.out.println("The substring is: " + substring);
    }
}
