import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line by whitespace, handling potential empty lines
                String[] parts = line.trim().split("\\s+"); 

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        // Process the integer if parsing is successful
                        System.out.println("Parsed integer: " + num); 
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid integer: " + part);
                        // Handle the error appropriately (e.g., skip, default value, etc.)
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
