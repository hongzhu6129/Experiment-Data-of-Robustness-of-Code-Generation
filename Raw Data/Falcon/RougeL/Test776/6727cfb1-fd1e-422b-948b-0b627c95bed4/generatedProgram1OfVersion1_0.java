import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            try {
                String[] parts = line.split("\\s+"); // Split by whitespace

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        // Process the integer if needed
                        System.out.println("Parsed integer: " + num); 
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid integer: " + part);
                        // Handle the error appropriately, e.g., skip, default value, or exit
                    }
                }


            } catch (Exception e) {
                System.err.println("Error processing line: " + line);
                e.printStackTrace(); // For debugging purposes
            }
        }

        scanner.close();
    }
}
