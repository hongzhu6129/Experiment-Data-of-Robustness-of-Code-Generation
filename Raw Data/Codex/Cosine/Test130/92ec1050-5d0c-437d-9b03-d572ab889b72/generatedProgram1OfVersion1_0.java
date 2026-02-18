import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+"); // Split the line by whitespace

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        // Process the integer if parsing is successful
                        System.out.println("Parsed integer: " + num); 
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid integer: " + part);
                        // Handle the invalid integer (e.g., skip it, assign a default value, etc.)
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner in the finally block
        }
    }
}
