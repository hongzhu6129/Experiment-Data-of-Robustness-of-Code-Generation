import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into parts based on whitespace (or other delimiters if needed)
                String[] parts = line.split("\\s+"); // Split on whitespace

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part.trim()); // Trim whitespace from each part
                        // Process the valid integer
                        System.out.println("Parsed integer: " + num); 
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid integer: " + part);
                        // Handle the invalid input appropriately (e.g., skip, replace with default, etc.)
                    }
                }


            }
        } catch (Exception e) {
            e.printStackTrace();  // Print the full exception for debugging
        } finally {
            scanner.close(); // Close the scanner in the finally block to ensure it's closed even if there's an exception
        }
    }
}
