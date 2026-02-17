import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {

        // 1. Using Scanner: This is the most common and recommended approach.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt(); 
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        System.out.print("Enter a single character: ");
        char charValue = scanner.nextLine().charAt(0);  // Read a line and take the first char


        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);
        System.out.println("Character: " + charValue);



        // 2. Using BufferedReader (Less common, but useful for large inputs):
        /*
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a line using BufferedReader: ");
            String line = reader.readLine();
            System.out.println("You entered: " + line);

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        */

        scanner.close(); // Important: Close the scanner to release resources


        // 3. Using Console (For passwords and sensitive data):
        /*  Console console = System.console(); 
            if (console != null) {  // Check if console is available (might not be in IDEs)
                char[] password = console.readPassword("Enter your password: ");
                String passwordString = new String(password); // Convert to String if needed
                System.out.println("You entered: " + passwordString); //  Be very careful about displaying passwords! In real applications, never display them directly.

                // Important: Clear the password array for security
                java.util.Arrays.fill(password, ' ');  
            } else {
                System.out.println("Console is not available."); //  Handle the case where a console is not available
            }
        */



    }
}
