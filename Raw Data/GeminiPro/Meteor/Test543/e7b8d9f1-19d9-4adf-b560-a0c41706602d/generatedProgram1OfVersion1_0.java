import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage: Read an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Example usage: Read a line of text
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        // Example usage: Read a double
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);


        scanner.close(); // Close the scanner when done
    }
}
