import java.util.Scanner;

public class StringChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (input.matches(".*[a-zA-Z0-9].*")) {
            System.out.println("The string contains at least one alphanumeric character.");
        } else {
            System.out.println("The string does not contain any alphanumeric characters.");
        }
    }
}
